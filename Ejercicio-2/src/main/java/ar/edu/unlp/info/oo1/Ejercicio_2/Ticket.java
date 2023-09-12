package ar.edu.unlp.info.oo1.Ejercicio_2;

import java.time.LocalDate;

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
		this.cantidadDeProductos=0;
		this.fecha=LocalDate.now();
		this.pesoTotal=0;
		this.precioTotal=0;
	}
	
	public double impuesto() {
		// TODO Auto-generated method stub
		return (this.precioTotal/100)*21;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}
	
	
}
