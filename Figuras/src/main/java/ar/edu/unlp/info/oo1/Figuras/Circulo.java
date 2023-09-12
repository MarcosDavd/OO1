package ar.edu.unlp.info.oo1.Figuras;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(String colorR,String colorL,double radio){
		super(colorR, colorL);
		this.radio = radio; 
	}

	public double calcularArea() {
		 return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radio  ;
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
