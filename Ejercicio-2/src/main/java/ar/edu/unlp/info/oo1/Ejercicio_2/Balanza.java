package ar.edu.unlp.info.oo1.Ejercicio_2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		// TODO Auto-generated constructor stub
		}
	
	public void ponerEnCero() {
		// TODO Auto-generated method stub
		this.precioTotal=0;
		this.pesoTotal=0;
		this.cantidadDeProductos=0;

	}
	
	public void agregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.precioTotal+=producto.getPeso()*producto.getPrecioPorKilo();
		this.cantidadDeProductos++;
		this.pesoTotal+=producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		ticket.setPrecioTotal(this.precioTotal);
		ticket.setCantidadDeProductos(this.cantidadDeProductos);
		ticket.setPesoTotal(this.pesoTotal);
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
}
