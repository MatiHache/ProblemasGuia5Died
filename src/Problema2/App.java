package Problema2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto prod1 = new Producto("Leche entera",45.99);
		Producto prod2 = new Producto("Yerba Taragüi",30);
		Producto prod3 = new Producto("Yogurt Ilolay",24.99);

		Pedido pedido1 = new PedidoBasico(false);
		Pedido pedido2 = new PedidoPremium();
		
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod1));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod2));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod3));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod1));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod2));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod3));
		System.out.println("Precio pedido1: "+pedido1.precio());
		System.out.println("Comision pedido1: "+pedido1.comision());
		
	}

}
