package ar.edu.unlp.info.oo1.Ejercicio_3_Bis;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		// TODO Auto-generated constructor stub
		this.productos = new ArrayList<>();
	}
	
	public void ponerEnCero() {
		// TODO Auto-generated method stub
		this.productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket();
		t.setProductos(this.productos);
		return t;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public List<Producto> getProductos() {
		return this.productos;
	}


	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecioPorKilo()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	
	
}
