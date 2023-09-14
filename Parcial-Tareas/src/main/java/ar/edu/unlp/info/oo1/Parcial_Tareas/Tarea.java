package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.time.LocalDate;

public abstract class Tarea {
	protected String titulo;
	protected String descripcion;
	protected String etiqueta;
	protected boolean estado;
	protected LocalDate fechavencimiento;
	
	// Getters y  Setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public LocalDate getFechacencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(LocalDate fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	// Metodos abstractos
	public abstract void establecerFechaDeVencimiento(LocalDate fecha);
	public abstract void agregarEtiqueta(String etiqueta);
	public abstract boolean marcarComoCompleta();
	

}
