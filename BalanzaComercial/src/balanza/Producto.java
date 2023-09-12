package balanza;

public class Producto {
	
	private String descripcion;
	private int pesoEnkg;
	
	public Producto(String descripcion,int pesoEnKg) {
		
		this.descripcion=descripcion;
		this.pesoEnkg=pesoEnKg;
		
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPesoEnkg() {
		return pesoEnkg;
	}

	public void setPesoEnkg(int pesoEnkg) {
		this.pesoEnkg = pesoEnkg;
	}
	
	
	
	
}
