package com.example.banco.dao;

import com.example.banco.model.Cliente;
import com.example.banco.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	public  Cliente getCliente(int id) throws SQLException {
        Cliente cliente = null;
        Connection con = DatabaseUtil.getConnection();
        String query = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            cliente = new Cliente(
                rs.getInt("id"),
                rs.getString("nombre_completo"),
                rs.getString("direccion"),
                rs.getString("telefono"),
                rs.getString("fecha_nacimiento")
            );
        }

        rs.close();
        ps.close();
        con.close();

        return cliente;
    }
	
    public List<Cliente> getAllClientes() throws SQLException {
    	
        List<Cliente> clientes = new ArrayList<>();
        Connection connection = DatabaseUtil.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNombreCompleto(rs.getString("nombre_completo"));
            cliente.setDireccion(rs.getString("direccion"));
            cliente.setTelefono(rs.getString("telefono"));
            cliente.setFechaNacimiento(rs.getString("fecha_nacimiento"));
            clientes.add(cliente);
        }
        System.out.println("*ClienteDAO* Clientes: "+clientes);
        rs.close();
        stmt.close();
        connection.close();

        return clientes;
    }

    public void addCliente(Cliente cliente) throws SQLException {
        Connection connection = DatabaseUtil.getConnection();
        String sql = "INSERT INTO cliente (nombre_completo, direccion, telefono, fecha_nacimiento) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, cliente.getNombreCompleto());
        stmt.setString(2, cliente.getDireccion());
        stmt.setString(3, cliente.getTelefono());
        stmt.setString(4,cliente.getFechaNacimiento());
        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public void updateCliente(Cliente cliente) throws SQLException {
        Connection connection = DatabaseUtil.getConnection();
        String sql = "UPDATE cliente SET nombre_completo = ?, direccion = ?, telefono = ?, fecha_nacimiento = ? WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, cliente.getNombreCompleto());
        stmt.setString(2, cliente.getDireccion());
        stmt.setString(3, cliente.getTelefono());
        stmt.setString(4,cliente.getFechaNacimiento());
        stmt.setInt(5, cliente.getId());
        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public void deleteCliente(int id) throws SQLException {
        Connection connection = DatabaseUtil.getConnection();
        String sql = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }
    
    public List<Cliente> searchClientesByName(String name) throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nombre_completo LIKE ? ";
        System.out.println("Reached searchClientesByName*");
        System.out.println("*SearchByClientName. Nombre buscado: "+name);
        
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" + name + "%");
            System.out.println("*SearchByClientName* ps:"+preparedStatement.toString());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String direccion = resultSet.getString("direccion");
                String telefono = resultSet.getString("telefono");
                String fechaNacimiento = resultSet.getString("fecha_nacimiento");
                clientes.add(new Cliente(id, nombreCompleto, direccion, telefono, fechaNacimiento));
            }
            System.out.println("*SearchByClientName* tamanio clientes: "+clientes.size());
        }
        return clientes;
    }

    
}


