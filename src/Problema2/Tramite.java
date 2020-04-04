package Problema2;

import java.time.LocalDate;

public class Tramite implements Comisionable{

	private String descripcion;
	private String domicilio;
	private LocalDate hora;
	private LocalDate fecha;
	private double monto;
	
	public Tramite(String descripcion, String domicilio, double monto) {
		this.descripcion = descripcion;
		this.domicilio = domicilio;
		this.monto = monto;
	}
	
	public double precio() {
		return this.monto + 50;
	}
	
	public double comision() {
		return 20;
	}
}
