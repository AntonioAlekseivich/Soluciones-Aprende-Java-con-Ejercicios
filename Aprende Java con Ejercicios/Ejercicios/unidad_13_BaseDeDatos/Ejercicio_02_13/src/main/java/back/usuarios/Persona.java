package back.usuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import back.dao.DAOPersona;

public abstract class Persona {
	// Atributos
	private String nombre;
	private String contrasenia;

	// Metodos
	//Const
	public Persona(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}
	public Persona() {

	}

	//Get y Set
	//Propios
	public abstract int getId();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(contrasenia, other.contrasenia) 
				&& Objects.equals(nombre, other.nombre);
	}


	//toString
	/**
	 * Devuelve una representación en forma de cadena de este objeto Administrador, incluyendo su nombre,
	 * historial de reproducciones y lista de favoritos.
	 * <p>
	 * El método {@code toString} devuelve el nombre del administrador.
	 * El método {@code toStringHistorial} devuelve una cadena que representa el historial de reproducciones del administrador.
	 * El método {@code toStringFavoritos} devuelve una cadena que representa la lista de favoritos del administrador.
	 * El método {@code informacionUsuario} devuelve una cadena que incluye el nombre del administrador, su historial de reproducciones
	 * y lista de favoritos.
	 * </p>
	 * 
	 * @return Una cadena que representa el objeto Administrador y su información asociada.
	 */
	@Override
	public String toString() {
		return  nombre + "\n";
	}


	//Funcionalidades
	//Buscador de personas
	/**
	 * Confirma si un nombre de usuario no se encuentra en ninguna de las listas de
	 * personas.
	 * 
	 * @param nombreUsuario El nombre de usuario a comprobar.
	 * @return true si el nombre de usuario no se encuentra en ninguna lista, false
	 *         en caso contrario.
	 *         @author antonBlagodarnyy
	 */
	public static boolean loginNoEncontrado(String nombreUsuario) {
		boolean noEncontrado = true;

		for (Usuario usuario : DAOPersona.usuarios.values()) {//Comprobamos que no se encuentre en usuarios
			if(usuario.getNombre().equals(nombreUsuario)) {
				noEncontrado=false;
				break;
			}
		}

		if(noEncontrado){//Comprobamos que no se encuentre en admin
			for(Administrador administrador : DAOPersona.admins.values()) {
				if(administrador.getNombre().equals(nombreUsuario)) {
					noEncontrado=false;
					break;
				}
			}
		}
		return noEncontrado;
	}

	/** 
	 * Busca una persona según su nombre de usuario.
	 * 
	 * @param nombreUsuario El nombre de usuario de la persona a buscar.
	 * @return La persona encontrada, o null si no se encuentra ninguna.
	 *@author antonBlagodarnyy
	 */
	public static Usuario buscarPersona(String nombreUsuario) {
		// Busca en el HashMap de usuarios
		for (Usuario usuario : DAOPersona.usuarios.values()) {
			if (usuario.getNombre().equals(nombreUsuario)) {
				return usuario; // Devuelve el usuario si se encuentra
			}
		}
		return null; // Si no se encuentra ninguna persona con el nombre de usuario proporcionado
	}
	/**
	 * Busca una persona segun su nombre y contrasenia
	 * 
	 * @param nombreUsuario
	 * @param contrasenia
	 * @return
	 * @author antonBlagodarnyy
	 */
	public static Persona buscarPersona(String nombreUsuario, String contrasenia) {
		Usuario usuarioAux = null;
		Administrador adminAux = null;

		// Busca en el HashMap de usuarios
		for (Usuario usuario : DAOPersona.usuarios.values()) {
			if (usuario.getNombre().equals(nombreUsuario) && usuario.getContrasenia().equals(contrasenia)) {
				usuarioAux = usuario; // Devuelve el usuario si se encuentra
				break;
			}
		}

		// Busca en el HashMap de administradores
		for (Administrador admin : DAOPersona.admins.values()) {
			if (admin.getNombre().equals(nombreUsuario) && admin.getContrasenia().equals(contrasenia)) {
				adminAux = admin; // Devuelve el administrador si se encuentra
				break;
			}
		}

		// Retorna el usuario o administrador encontrado, o null si no se encuentra
		// ninguna persona
		return usuarioAux != null ? usuarioAux : adminAux;
	}
	/**
	 * Busca una persona según su ID.
	 * 
	 * @param idPersona El ID de la persona a buscar.
	 * @return La persona encontrada, o null si no se encuentra ninguna persona con
	 *         el ID proporcionado.
	 *         @author antonBlagodarnyy
	 */
	public static Persona buscarPersona(int idPersona) {
		// Busca en el HashMap de usuarios
		for (Usuario usuario : DAOPersona.usuarios.values()) {
			if (usuario.getId() == idPersona) {
				return usuario; // Devuelve el usuario si se encuentra
			}
		}
		// Busca en el HashMap de administradores
		for (Administrador admin : DAOPersona.admins.values()) {
			if (admin.getId() == idPersona) {
				return admin; // Devuelve el administrador si se encuentra
			}
		}

		return null; // Si no se encuentra ninguna persona con el ID proporcionado
	}

	/**
	 * Busca un id que no se encuentre en la bd
	 * 
	 * @return int disponible
	 * @author antonBlagodarnyy
	 */
	public static int idDisponible() {
		int number = 0;
		while (DAOPersona.getIdsPersonas().contains(number)) {
			number++;
		}

		return number;
	}
}
