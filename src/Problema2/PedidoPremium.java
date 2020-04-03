package Problema2;

public class PedidoPremium extends Pedido{

	public double precio() {
		double precio = 0;
		double tasa;
		if(this.listaProductos.size() <= 5) tasa = 0.2;
		else tasa = 0.3;
	for(Producto unProd: this.listaProductos) {
		precio += unProd.getPrecio() + unProd.getPrecio()*tasa;
	}
	return precio;
	}
	public double comision() {
		if(this.listaProductos.size() > 10) return (this.precio()*0.15 + 50);
		else return this.precio()*0.15;
	}
	
}
