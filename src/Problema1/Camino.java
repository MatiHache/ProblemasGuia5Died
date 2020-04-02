package Problema1;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Camino {
	private static final double r_earth = 6378 * 1000;

	private ArrayList<Coordenada> listaCoordenadas;
	
	public Camino() {
		this.listaCoordenadas = new ArrayList<>();
	}
	
	public void agregar(Coordenada x) {
		
		this.listaCoordenadas.add(x);
		
	}
	
	public void agregar(double lat, double lon) {
		
		this.listaCoordenadas.add(new Coordenada(lat, lon));
		
	}
	
	public void agregar(int mtsLt,int mtsLn) {
		
		double latitude = this.listaCoordenadas.get(listaCoordenadas.size()-1).getLatitud();
		double longitude = this.listaCoordenadas.get(listaCoordenadas.size()-1).getLongitud();
		
		double new_latitude  = latitude  + (mtsLn / r_earth) * (180 / Math.PI);
		double new_longitude = longitude + ( mtsLt / r_earth) * (180 / Math.PI) / Math.cos(latitude * Math.PI/180);

		this.listaCoordenadas.add(new Coordenada(new_latitude, new_longitude));
	
}
	public List<Coordenada> buscar(Coordenada no, Coordenada se){
		List<Coordenada> lista = new ArrayList<>();
		for(Coordenada unaCoordenada: this.listaCoordenadas) {
			if((unaCoordenada.getLatitud() < se.getLatitud() && unaCoordenada.getLatitud() > no.getLatitud())
			&& (unaCoordenada.getLongitud() > se.getLongitud() && unaCoordenada.getLongitud() < no.getLongitud()))
			{
				lista.add(unaCoordenada);
				}
		}
		return lista;
	}
	
	public void mostrar() {
		for(int i=0; i<this.listaCoordenadas.size(); i++) {
		System.out.println("Coordenada "+(i+1)+": "+this.listaCoordenadas.get(i));
		}
	}
	
	

}
