package com.example.banco.model;

public class Articulo {

    private int codigo;
    private String descripcion;
    private double pCompra;
    private double pVenta;
    private int stock;

    // Constructor
    public Articulo(int codigo, String descripcion, double precioDeCompra, double precioDeVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pCompra = precioDeCompra;
        this.pVenta = precioDeVenta;
        this.stock = stock;
    }

    // Default Constructor
    public Articulo() {
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioDeCompra() {
		return pCompra;
	}

	public void setPrecioDeCompra(double precioDeCompra) {
		this.pCompra = precioDeCompra;
	}

	public double getPrecioDeVenta() {
		return pVenta;
	}

	public void setPrecioDeVenta(double precioDeVenta) {
		this.pVenta = precioDeVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", pCompra=" + pCompra + ", pVenta="
				+ pVenta + ", stock=" + stock + "]";
	}


}