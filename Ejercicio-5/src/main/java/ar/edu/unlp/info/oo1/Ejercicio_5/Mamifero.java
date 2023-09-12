package ar.edu.unlp.info.oo1.Ejercicio_5;

import java.time.LocalDate;

public class Mamifero {
	private LocalDate fechaDeNacimiento;
	private String identificador;
	private String especie;
	private Mamifero padre,madre;
	
	public Mamifero(LocalDate fechaDeNacimiento, String identificador,String especie,Mamifero padre, Mamifero madre) {
		// TODO Auto-generated constructor stub
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.identificador = identificador;
		this.especie = especie;
		this.madre = madre;
		this.padre = padre;
	}

	public LocalDate getFechaDeNacimiento() {return fechaDeNacimiento;}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {this.fechaDeNacimiento = fechaDeNacimiento;}

	public String getIdentificador() {return identificador;}

	public void setIdentificador(String identificador) {this.identificador = identificador;}

	public String getEspecie() {return especie;}

	public void setEspecie(String especie) {this.especie = especie;}

	public Mamifero getPadre() {return padre;}

	public void setPadre(Mamifero padre) {this.padre = padre;}

	public Mamifero getMadre() {return madre;}

	public void setMadre(Mamifero madre) {this.madre = madre;}
	
	
	private Mamifero esAncestroMadre(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		if(this.getMadre().equals(unMamifero))return this.getMadre();
		else return this.getMadre().esAncestroMadre(unMamifero);
	}
	private Mamifero esAncestroPadre(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		if(this.getPadre().equals(unMamifero))return this.getPadre();
		else return this.getPadre().esAncestroPadre(unMamifero);
	}
	
	public boolean tieneComoA(Mamifero mamifero) {
		boolean es = false;
		if(this.esAncestroMadre(mamifero)!= null) {
			es = true;
		}
		if(es==false) {
			if(this.esAncestroPadre(mamifero)!= null) {
				es=true;
			}
		}
		
		return es;
	}
	
	
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		//Este metodo retorna true si el mamifero recibido por parametro es ancestro de this 
		boolean esAncestro = false;
		
		if((this.getPadre() != null)) {
			if(this.getPadre().equals(unMamifero)) {
				esAncestro=true;
			}else {
				esAncestro = this.getPadre().tieneComoAncestroA(unMamifero);
			}			
		}
		if(esAncestro == false) {
			if( (this.getMadre()) != null) {
				if(this.getMadre().equals(unMamifero)) {
					esAncestro=true;
				}else {
					esAncestro = this.getMadre().tieneComoAncestroA(unMamifero);
				}
			}
		}
		return esAncestro;
		
		
		
		
		
		return true;
					
	}
	
}

