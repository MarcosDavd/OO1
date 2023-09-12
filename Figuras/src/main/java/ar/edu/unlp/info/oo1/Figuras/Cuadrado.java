package ar.edu.unlp.info.oo1.Figuras;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String colorR, String colorL) {
		super(colorR, colorL);
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
		

}
