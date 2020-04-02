package Problema1;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		
		Coordenada c1 = new Coordenada(43.5, 55.7);
		Coordenada c2 = new Coordenada(43.5, 55.7);
		Coordenada c3 = new Coordenada(132.5, 12.4);
		Coordenada c4 = new Coordenada();
		Coordenada c5 = new Coordenada(500, 0);
		Coordenada c6 = new Coordenada(0, 500);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		
		Camino camino1 = new Camino();
		camino1.agregar(c1);
		camino1.agregar(c2);
		camino1.agregar(c3);
		camino1.agregar(432.2, 443.8);
		camino1.agregar(3000, 2000);
		
		System.out.println("C1 = C2?: "+c1.equals(c2));
		System.out.println(camino1.buscar(c5, c6));
		
		camino1.mostrar();
	}
	
}
