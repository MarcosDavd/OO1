package ar.edu.unlp.info.oo1.Ejercicio_3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		// TODO Auto-generated constructor stub
		this.cantidad=cantidad;
		this.detalle=detalle;
		this.costoUnitario=costoUnitario;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}

}
