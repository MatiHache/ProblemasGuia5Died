package Problema2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto prod1 = new Producto("Leche entera",45.99);
		Producto prod2 = new Producto("Yerba Taragüi",30);
		Producto prod3 = new Producto("Yogurt Ilolay",24.99);

		Pedido pedido1 = new PedidoBasico(false);
		Pedido pedido2 = new PedidoPremium();
		Tramite tr1 = new Tramite("Pagar API","Mendoza 3660",1240.5);
		Tramite tr2 = new Tramite("Pagar patente","San Martin 1540", 1240.5);
		
		Cadete cad1 = new Cadete();
		
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod1));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod2));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod3));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod1));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod2));
		System.out.println("Se agrega producto a pedido1: "+pedido1.agregarProducto(prod3));
		System.out.println("Precio pedido1: "+pedido1.precio());
		System.out.println("Comision pedido1: "+pedido1.comision());
		
		for(int i=0; i<12; i++) pedido2.agregarProducto(prod1);
		System.out.println("Precio pedido2: "+pedido2.precio());
		System.out.println("Comision pedido2: "+pedido2.comision());
		System.out.println("Comision tramite1: "+tr1.comision());
		System.out.println("Comision tramite2: "+tr2.comision());
		
		cad1.agregarComisionable(pedido1);
		cad1.agregarComisionable(pedido2);
		cad1.agregarComisionable(tr1);
		cad1.agregarComisionable(tr2);
		System.out.println("Comisiones: "+cad1.comisiones());
	
	}

}
