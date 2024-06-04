package com.example.banco.dao;

import com.example.banco.model.Articulo;
import com.example.banco.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.banco.model.Articulo;
import com.example.banco.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlmacenDAO {
    public Articulo getArticulo(int codigo) throws SQLException {
        Articulo articulo = null;
        Connection con = DatabaseUtil.getConnection();
        String query = "SELECT * FROM almacen WHERE codigo = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            articulo = new Articulo(
                rs.getInt("codigo"),
                rs.getString("descripcion"),
                rs.getDouble("precio_de_compra"),
                rs.getDouble("precio_de_venta"),
                rs.getInt("stock")
            );
        }

        rs.close();
        ps.close();
        con.close();

        return articulo;
    }
    
    public List<Articulo> getAllArticulos() throws SQLException {
        List<Articulo> articulos = new ArrayList<>();
        Connection connection = DatabaseUtil.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM almacen");

        while (rs.next()) {
            Articulo articulo = new Articulo();
            articulo.setCodigo(rs.getInt("codigo"));
            articulo.setDescripcion(rs.getString("descripcion"));
            articulo.setPrecioDeCompra(rs.getDouble("precio_de_compra"));
            articulo.setPrecioDeVenta(rs.getDouble("precio_de_venta"));
            articulo.setStock(rs.getInt("stock"));
            articulos.add(articulo);
        }
        rs.close();
        stmt.close();
        connection.close();

        return articulos;
    }

    public void addArticulo(Articulo articulo) throws SQLException {
    	try {
    		Connection connection = DatabaseUtil.getConnection();
            String sql = "INSERT INTO almacen ( descripcion, precio_de_compra, precio_de_venta, stock) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            

            stmt.setString(1, articulo.getDescripcion());
            stmt.setDouble(2, articulo.getPrecioDeCompra());
            stmt.setDouble(3, articulo.getPrecioDeVenta());
            stmt.setInt(4, articulo.getStock());
            stmt.executeUpdate();
            stmt.close();
            connection.close();
            
		} catch (Exception e) {
			System.out.println("*AlmacenDAO* Excepcion en addArticulo");
		}
    }

    public void updateArticulo(Articulo articulo) throws SQLException {
        Connection connection = DatabaseUtil.getConnection();
        String sql = "UPDATE almacen SET descripcion = ?, precio_de_compra = ?, precio_de_venta = ?, stock = ? WHERE codigo = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, articulo.getDescripcion());
        stmt.setDouble(2, articulo.getPrecioDeCompra());
        stmt.setDouble(3, articulo.getPrecioDeVenta());
        stmt.setInt(4, articulo.getStock());
        stmt.setInt(5, articulo.getCodigo());
        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }

    public void deleteArticulo(int codigo) throws SQLException {
        Connection connection = DatabaseUtil.getConnection();
        String sql = "DELETE FROM almacen WHERE codigo = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, codigo);
        stmt.executeUpdate();
        stmt.close();
        connection.close();
    }
    
    public List<Articulo> searchArticulosByDescripcion(String descripcion) throws SQLException {
        List<Articulo> articulos = new ArrayList<>();
        String sql = "SELECT * FROM almacen WHERE descripcion LIKE ?";
        
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" + descripcion + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Articulo articulo = new Articulo();
                articulo.setCodigo(resultSet.getInt("codigo"));
                articulo.setDescripcion(resultSet.getString("descripcion"));
                articulo.setPrecioDeCompra(resultSet.getDouble("precio_de_compra"));
                articulo.setPrecioDeVenta(resultSet.getDouble("precio_de_venta"));
                articulo.setStock(resultSet.getInt("stock"));
                articulos.add(articulo);
            }
        }
        return articulos;
    }


public List<Articulo> searchArticulosByCodigo(int codigo) throws SQLException {
    List<Articulo> articulos = new ArrayList<>();
    String sql = "SELECT * FROM almacen WHERE codigo = ?";
    
    try (Connection connection = DatabaseUtil.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setInt(1, codigo);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            Articulo articulo = new Articulo();
            articulo.setCodigo(resultSet.getInt("codigo"));
            articulo.setDescripcion(resultSet.getString("descripcion"));
            articulo.setPrecioDeCompra(resultSet.getDouble("precio_de_compra"));
            articulo.setPrecioDeVenta(resultSet.getDouble("precio_de_venta"));
            articulo.setStock(resultSet.getInt("stock"));
            articulos.add(articulo);
        }
    }
    return articulos;
}

public void updateStock(Articulo articulo, int stock) throws SQLException {
	 Connection connection = DatabaseUtil.getConnection();
	 String sql = "UPDATE almacen " + // Added space after 'almacen'
             "SET Stock = ? " +  // Added space after '='
             "WHERE Codigo = ?"; // No change here
     
     PreparedStatement stmt = connection.prepareStatement(sql);
     
     stmt.setInt(1, stock);
     stmt.setInt(2, articulo.getCodigo());

     stmt.executeUpdate();
     stmt.close();
     connection.close();
	
}
}
