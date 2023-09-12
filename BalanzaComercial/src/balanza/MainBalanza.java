package balanza;

import java.util.Scanner;

public class MainBalanza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Balanza b = new Balanza();
		
		
		
		System.out.println("------------------------------------------------Compra Iniciada----------------------------------");
		b.iniciarCompra();
		
		double precio;
		System.out.println("Ingrese el precio por kilo  ");
		precio=sc.nextDouble();
		while (precio != 0) {
			System.out.println("Ingrese el peso en Kilos  ");
			int peso=sc.nextInt();
			System.out.println("Ingrese la descripcion del producto");
			String descipcion=sc.next();
			Producto p = new Producto(descipcion, peso);
			b.registrarProductoAPagar(p, precio);
			System.out.println("Ingrese el precio por kilo  ");
			precio=sc.nextDouble();
		}
		System.out.println(b.devolverResumenDeCompra());
		
	}

}
