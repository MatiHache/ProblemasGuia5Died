package Problema2;

public class Producto {

	private String descripcion;
	private double precio;
	
	public Producto() {};
	public Producto(String desc, double precio) {
		this.descripcion = desc;
		this.precio = precio;
	}
	public double getPrecio() {return this.precio;}
	public  String getDescripcion() {return this.descripcion;}
}
