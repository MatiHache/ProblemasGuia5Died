package Problema2;

public class PedidoBasico extends Pedido {

	private boolean express;
	
	public PedidoBasico() {};
	public PedidoBasico(boolean express) {
		this.express = express;
	}
	public double precio() {
		double precio = 0; 
		for(Producto unProd: this.listaProductos) {
			precio+= (unProd.getPrecio() + unProd.getPrecio()*0.05);
		}
	if(this.express == true) precio+= precio * 0.2;

	return precio;
	}
	
	public double comision() {
		return this.precio()*0.1;	
	}
}
