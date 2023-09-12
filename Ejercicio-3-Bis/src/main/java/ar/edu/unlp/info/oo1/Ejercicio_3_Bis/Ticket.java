package ar.edu.unlp.info.oo1.Ejercicio_3_Bis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
		this.fecha=LocalDate.now();
		this.productos = new ArrayList<>(); 
	}
	
	public double impuesto() {
		// TODO Auto-generated method stub
		double total = this.productos.stream().mapToDouble(producto -> producto.getPrecioPorKilo()).sum();
		
		return ( total/100)*21;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}


	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecioPorKilo()).sum();
	}
	
	
}
