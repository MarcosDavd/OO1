package ar.edu.unlp.info.oo1.Figuras;

public class Triangulo extends Figura{
	private int lado1;
	private int lado3;
	private int lado2;
	
	public Triangulo(int lado1,int lado2,int lado3,String colorR,String colorL) {
		// TODO Auto-generated constructor stub
		super(colorR, colorL);
		this.lado1 = lado1;
		this.lado1 = lado2;
		this.lado1 = lado3;
	}
	
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
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
