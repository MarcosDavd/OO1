package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.util.List;

public class Proyecto {
	private String titulo;
	private String descripcion;
	private List<Tarea> tareas;
	public Proyecto(String titulo,String descripcion,List<Tarea> tareas) {
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.tareas=tareas;
	}
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
	public List<Tarea> getTareas() {
		return tareas;
	}
	public void setTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}
	
	
	
	
}
