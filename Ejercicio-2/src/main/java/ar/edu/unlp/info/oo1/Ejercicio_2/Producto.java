package ar.edu.unlp.info.oo1.Ejercicio_2;

public class Producto {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		// TODO Auto-generated constructor stub
		this.peso=0;
		this.descripcion="";
		this.precioPorKilo=0;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
