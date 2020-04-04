package Problema2;

import java.util.ArrayList;

public class Cadete {

	private ArrayList<Comisionable> listaComisionable;
	
	public Cadete() {
		this.listaComisionable = new ArrayList<>();
	}
	public void agregarComisionable(Comisionable p) {
		this.listaComisionable.add(p);
	}
	public double comisiones() {
		double comisiones = 0;
		for(Comisionable p: this.listaComisionable) {
			comisiones+=p.comision();
		}
		return comisiones;
	}
}
