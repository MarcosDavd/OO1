package balanza;

public class Balanza {
	private int items;
	private double monto;
	private String resumen;
	
	public Balanza() {
	}
	
	//getters ans setters
	
	//Methods
	public void iniciarCompra() {
		//Inicializa el monto y cantidad de items de la compra actual
		this.items=0;
		this.monto=0;
		this.resumen=" ";
	}
	
	
	public void registrarProductoAPagar(Producto producto , double precioPorKg) {
		// actualiza el estado de la balanza
		this.items++;
		double montoActual = producto.getPesoEnkg() * precioPorKg;
		this.monto+= montoActual;
		String cadena = Double.toString(montoActual);
		this.resumen+=producto.getDescripcion()+" "+cadena+" ";
	}
	
	
	 public double devolverMontoAPagar() {
		// TODO Auto-generated method stub
		return this.monto;
	}
	 public String devolverResumenDeCompra() {
		// retorna un Srtrig del siguiente estilo"total A pagar X"
		 return this.resumen + "Total a pagar "+this.monto+" por la compra de "+this.items+" productos";
	}
	
}
