package ar.edu.unlp.info.oo1.Ejercicio_5;

import java.time.LocalDate;

public class Mamifero {
	private LocalDate fechaDeNacimiento;
	private String identificador;
	private String especie;
	private Mamifero padre,madre;
	
	public Mamifero(String identidficador) {
		this.identificador = identidficador;
	}
	public Mamifero() {
		
	}
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

	public Mamifero getMadre() {return this.madre;}

	public void setMadre(Mamifero madre) {this.madre = madre;}
	
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return this.getMadre().getMadre();
	}
	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}
	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}
	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}
	
	
	
	
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		//Este metodo retorna true si el mamifero recibido por parametro es ancestro de this 
		boolean esAncestro = false;
		
		if((this.getPadre() != null)) {
			esAncestro = this.getPadre().equals(unMamifero);
			if(!esAncestro) esAncestro = this.getPadre().tieneComoAncestroA(unMamifero);				
		}
		if(esAncestro == false) {
			if(this.getMadre()!=null) {
				esAncestro = this.getMadre().equals(unMamifero);
				if(!esAncestro) esAncestro = this.getMadre().tieneComoAncestroA(unMamifero);	
			}
		}
		return esAncestro;
	}


}