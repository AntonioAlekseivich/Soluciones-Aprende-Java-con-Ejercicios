package back.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import back.usuarios.Administrador;
import back.usuarios.Persona;
import back.usuarios.Usuario;

/**
 * Clase utilizada para obtener informacion de los Usuarios de la base de datos.
 */
public class DAOPersona {
	public static final String BOOLEAN_ADMIN = "A", BOOLEAN_USER = "U";// La bd no admite boolean

	// Configuración de la conexión a la base de datos Oracle XE
	static String url = "jdbc:oracle:thin:@localhost:1521:XE"; // URL de conexión
	static String usuario = "SYSTEM"; // Usuario de la base de datos
	static String contraseña = "Admin2023"; // Contraseña de la base de datos

	//Listas
	public static HashMap<Integer, Usuario> usuarios = new HashMap<>();
	public static HashMap<Integer, Administrador> admins = new HashMap<>();

	//Personas
	public static List<Integer> getIdsPersonas() {
		List<Integer> idPersonas = new ArrayList<>(usuarios.keySet());
		idPersonas.addAll(admins.keySet());
		return idPersonas;
	}
	
	/**
	 * Conecta a la base de datos y obtiene la lista actualizada de personas.
	 * Esta lista se divide en usuarios y administradores, los cuales son almacenados
	 * en HashMaps separados, con las claves como el ID de la persona.
	 * 
	 * @return No devuelve ningún valor, pero actualiza los HashMaps 'usuarios' y 'admins'
	 *         con la información obtenida de la base de datos.
	 *         
	 * @throws SQLException Si ocurre un error durante la conexión a la base de datos
	 *                      o durante la ejecución de la consulta SQL.
	 *                     
	 * @author antonBlagodarnyy
	 */
	public static void getListasPersonas() {

		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			String selectSql = "SELECT * FROM PERSONA";
			ResultSet rs = stmt.executeQuery(selectSql);

			// Recorre el ResultSet e imprime los datos
			while (rs.next()) {
				int idUsuario = rs.getInt("id_persona");
				String nombre = rs.getString("nombre");
				String contrasenia = rs.getString("contrasenia");
				String tipo = rs.getString("tipo");// Tipo es o "U" o "A"
				int baneado = rs.getInt("baneado");// Baneado es o "1" o "0"
				boolean ban;
				if (baneado == 1)
					ban = true;
				else
					ban = false;

				if (tipo.equals(BOOLEAN_USER))
					usuarios.put(idUsuario, Usuario.crearUsuario(idUsuario, nombre, contrasenia, ban));

				else
					admins.put(idUsuario, Administrador.crearAdministrador(idUsuario, nombre, contrasenia));
			}
		} catch (SQLException e) {
			System.out.println("Error en getListaUsuarios");
		}

	}
	/**
	 * Actualiza las listas de usuarios y administradores eliminando los datos actuales
	 * y volviendo a obtener la información de la base de datos.
	 * 
	 * @author antonBlagodarnyy
	 */
	public static void actualizarListaPersonas() {
		usuarios.clear();
		admins.clear();
		getListasPersonas();
	}

	/**
	 * Pilla la lista de permisos de cada usuario
	 */
	public static boolean [] getPermisosDAO(Usuario usuarioAux) {
		boolean [] permisos = new boolean[Usuario.CANTIDAD_PERMISOS ];

		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			String selectSql = "SELECT * FROM PERMITS WHERE id_persona = "+usuarioAux.getId();
			ResultSet rs = stmt.executeQuery(selectSql);
			
			while (rs.next()) {
			    permisos[0] = rs.getInt("piramide") == 1;
			    permisos[1] = rs.getInt("tres_en_raya") == 1;
			    permisos[2] = rs.getInt("dado") == 1;
			}
			System.out.println("Permisos recibidos en dao");
			for (boolean b : permisos) {
				System.out.println(b);
			}
			System.out.println("\n");
			
		} catch (SQLException e){
			
		}
		return permisos;
	}
	
	/**
     * Update a column in the Permits table.
     *
     * @param idPersona the ID of the person
     * @param column the name of the column to update
     * @param value the boolean value to set (true = 1, false = 0)
     * @throws SQLException if a database access error occurs
     */
    public static void updatePermit(int idPersona, String column, boolean value) throws SQLException {
        // Validate the column name to prevent SQL injection
        if (!isValidColumn(column)) {
            throw new IllegalArgumentException("Invalid column name");
        }

        // Convert boolean to integer (true = 1, false = 0)
        int intValue = value ? 1 : 0;

        // Prepare the SQL statement with the validated column name
        String sql = "UPDATE Permits SET " + column + " = ? WHERE id_persona = ?";

        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, intValue);
            stmt.setInt(2, idPersona);

            // Execute the update
            stmt.executeUpdate();
        }
        DAOPersona.actualizarListaPersonas();
    }

    // Helper method to validate column names
    private static boolean isValidColumn(String column) {
        return column.equals("piramide") || column.equals("tres_en_raya") || column.equals("dado");
    }
	
	//Usuarios
	/**
	 * Inserta un nuevo usuario en la base de datos y actualiza la lista de usuarios.
	 * 
	 * @param usuario El usuario a insertar en la base de datos.
	 * @throws SQLException Si hay un error al insertar el usuario en la base de datos.
	 *
	 * @author antonBlagodarnyy
	 */
	public static void insertUsuario(Usuario usuario) {
		int baneado;

		// Intenta establecer la conexión
		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				// Indicamos usuario y contraseña
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			if (usuario.isBaneado())
				baneado = 1;
			else
				baneado = 0;

			String sql = "INSERT INTO PERSONA (id_persona,nombre, contrasenia, tipo,baneado) " + "VALUES ('"
					+ usuario.getId() + "','" + usuario.getNombre() + "', '" + usuario.getContrasenia() + "', 'U',"
					+ baneado + ")";
			// Ejecutar la sentencia SQL
			stmt.execute(sql);
			System.out.println("Insert usuario ejecutado correctamente.");
			insertPermisosVacios(usuario);
		} catch (SQLException e) {

		}
		actualizarListaPersonas();
	}
	private static void insertPermisosVacios(Usuario usuario) {
		// Intenta establecer la conexión
		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				// Indicamos usuario y contraseña
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			String sql = "INSERT INTO Permits (id_persona, piramide, tres_en_raya, dado) VALUES ('" + usuario.getId() + "', 0, 0, 0)";

			// Ejecutar la sentencia SQL
			stmt.execute(sql);
			System.out.println("Insert permisos ejecutado correctamente.");
		} catch (SQLException e) {

		}
		
	}
	
	/**
	 * Elimina un usuario de la base de datos y actualiza la lista de usuarios.
	 * 
	 * @param usuario El usuario a eliminar de la base de datos.
	 * @throws SQLException Si hay un error al eliminar el usuario de la base de datos.
	 *
	 *@author antonBlagodarnyy
	 */
	public static void deleteUsuario(Usuario usuario) {

		// Intenta establecer la conexión
		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				// Indicamos usuario y contraseña

				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			String sql = "DELETE from persona where id_persona=" + usuario.getId();
			// Ejecutar la sentencia SQL
			stmt.execute(sql);
			System.out.println("Sentencia ejecutada correctamente.");
		} catch (SQLException e) {

		}
		actualizarListaPersonas();
	}

	/**
	 * Actualiza el nombre de inicio de sesión de un usuario en la base de datos y
	 * actualiza la lista de usuarios.
	 * 
	 * @param usuario El usuario cuyo nombre de inicio de sesión se actualizará.
	 * @param login   El nuevo nombre de inicio de sesión para el usuario.
	 * @throws SQLException Si hay un error al actualizar el nombre de inicio de sesión en la base de datos.
	 *
	 *@author antonBlagodarnyy
	 */
	public static void updateUsuarioLogin(Usuario usuario, String login) {

		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				Statement stmt = conn.createStatement()) {

			// Construct the SQL UPDATE statement
			String sql = "UPDATE persona SET nombre = '" + login + "' WHERE id_persona = " + usuario.getId();

			// Execute the update statement
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Usuario actualizado correctamente.");
			} else {
				System.out.println("No se pudo actualizar el usuario.");
			}
		} catch (SQLException e) {

		}
		actualizarListaPersonas();
	}
	/**
	 * Actualiza el estado de baneo de un usuario en la base de datos y
	 * actualiza la lista de usuarios.
	 * 
	 * @param usuario El usuario cuyo estado de baneo se actualizará.
	 * @param ban     El nuevo estado de baneo para el usuario (0 para no baneado, 1 para baneado).
	 * @throws SQLException Si hay un error al actualizar el estado de baneo en la base de datos.
	 * @author antonBlagodarnyy
	 */
	public static void updateUsuarioBan(Usuario usuario, int ban) {

		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				Statement stmt = conn.createStatement()) {

			// Construct the SQL UPDATE statement
			String sql = "UPDATE persona SET baneado = " + ban + " WHERE id_persona =" + usuario.getId();

			// Execute the update statement
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Usuario actualizado correctamente.");
			} else {
				System.out.println("No se pudo actualizar el usuario.");
			}
		} catch (SQLException e) {

		}
		actualizarListaPersonas();
	}
	/**
	 * Actualiza la contraseña de un usuario en la base de datos y
	 * actualiza la lista de usuarios.
	 * 
	 * @param usuario  El usuario cuya contraseña se actualizará.
	 * @param password La nueva contraseña para el usuario.
	 * @throws SQLException Si hay un error al actualizar la contraseña en la base de datos.
	 * @author antonBlagodarnyy
	 */
	public static void updateUsuarioPassword(Usuario usuario, String password) {

		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				Statement stmt = conn.createStatement()) {

			String sql = "UPDATE persona SET contrasenia = '" + password + "' WHERE id_persona =" + usuario.getId();

			// Execute the update statement
			int rowsAffected = stmt.executeUpdate(sql);

			if (rowsAffected > 0) {
				System.out.println("Usuario actualizado correctamente.");
			} else {
				System.out.println("No se pudo actualizar el usuario.");
			}
		} catch (SQLException e) {

		}
		actualizarListaPersonas();
	}

	//DDL
	/**
	 * Crea la tabla PERSONA en la base de datos con las columnas correspondientes.
	 * La tabla PERSONA contiene información sobre los usuarios, incluyendo su ID, nombre,
	 * contraseña, tipo (administrador o usuario) y estado de baneo.
	 * 
	 * @throws SQLException Si hay un error al ejecutar la sentencia SQL para crear la tabla en la base de datos.
	 * @author antonBlagodarnyy
	 */
	public static void crearTablaPersona() {
		String sql = "CREATE TABLE PERSONA ("+
				" id_persona NUMBER PRIMARY KEY,"+
				"  nombre VARCHAR(100),"+
				"  contrasenia VARCHAR(100),"+
				"  tipo VARCHAR(1) CHECK (tipo IN ('A', 'U')),"+
				" baneado NUMBER(1,0)"+
				")";

		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
				// Ejecuto el create
				Statement stmt = conn.createStatement()) {

			stmt.execute(sql);

		} catch (SQLException e) {

		}
	}
	/**
	 * Inserta un administrador predeterminado en la base de datos.
	 * Este método se utiliza para inicializar la base de datos con un administrador
	 * por defecto al crearla.
	 * 
	 * @throws SQLException Si hay un error al insertar el administrador en la base de datos.
	 * @author antonBlagodarnyy
	 */
	public static void insertarAdmin() {
		// Intenta establecer la conexión
		try (Connection conn = DriverManager.getConnection(url, "SYSTEM", "Admin2023");
				// Indicamos usuario y contraseña
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL

			String sql = "INSERT INTO persona (id_persona, nombre, contrasenia,tipo,baneado) VALUES (1, 'Admin1', '1234','A',0)";
			// Ejecutar la sentencia SQL
			stmt.execute(sql);

		} catch (SQLException e) {


		}
	}
	/**
	 * Inicializa la tabla de personas en la base de datos creando la tabla y 
	 * agregando un administrador predeterminado.
	 * 
	 * @throws SQLException Si hay un error al crear la tabla de personas o al insertar el administrador en la base de datos.
	 * @see #crearTablaPersona()
	 * @see #insertarAdmin()
	 * @author antonBlagodarnyy
	 */
	public static void inicializarPersonas() {
		crearTablaPersona();
		insertarAdmin();
	}

}