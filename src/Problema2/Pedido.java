package Problema2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pedido implements Comisionable {

	protected ArrayList<Producto> listaProductos = new ArrayList<>(); 
	
	public final boolean agregarProducto(Producto p) {
		boolean retorno = false;
		if(this.getClass().equals(PedidoBasico.class) ) {
			if(this.listaProductos.size() == 5) retorno = false;
			else {
				this.listaProductos.add(p);
				retorno = true;
			}	
		}
		else if(this.getClass().equals(PedidoPremium.class)) {
			if(this.listaProductos.size() == 20) retorno = false;
			else {
				this.listaProductos.add(p);
				retorno = true;
			}
		}
		return retorno;
	}
	
	public abstract double precio();
	public abstract double comision();
	
}
