package Problema1;

public class Coordenada {

	private double latitud;
	private double longitud;

	public Coordenada() {super();}
	
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public double getLatitud() { return this.latitud; }
	public double getLongitud() { return this.longitud; }
	
	@Override
	public boolean equals(Object otroPar) {
		Coordenada par = (Coordenada) otroPar;
		if(this.latitud == (par.getLatitud()) && (this.longitud == par.getLongitud())) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		String ret;
		ret = "Latitud: "+this.latitud+" Longitud: "+this.longitud;
		return ret;
	}
	
}
