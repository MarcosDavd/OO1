package ar.edu.unlp.info.oo1.Figuras;

public abstract class Figura {
	
	private String colorR;
	private String colorL;
	
	public Figura(String colorR,String colorL) {
		// TODO Auto-generated constructor stub
		this.colorL = colorL;
		this.colorR = colorR;
	}
	public String getColorR() {
		return colorR;
	}
	public void setColorR(String colorR) {
		this.colorR = colorR;
	}
	public String getColorL() {
		return colorL;
	}
	public void setColorL(String colorL) {
		this.colorL = colorL;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	
}
