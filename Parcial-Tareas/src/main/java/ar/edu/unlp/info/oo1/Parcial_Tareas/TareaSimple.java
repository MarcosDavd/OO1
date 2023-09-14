package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.time.LocalDate;

public class TareaSimple extends Tarea{

	public TareaSimple(String titulo, String descripcion) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setEstado(false);
		this.setEtiqueta(null);
		this.setFechavencimiento(null);
	}
	
	
	@Override
	public void establecerFechaDeVencimiento(LocalDate fecha) {
		this.setFechavencimiento(fecha);
	}

	@Override
	public void agregarEtiqueta(String etiqueta) {
		// TODO Auto-generated method stub
		this.setEtiqueta(etiqueta);
	}
	public void editarTarea() {
		this.setDescripcion(descripcion);
	}


	@Override
	public boolean marcarComoCompleta() {
		// TODO Auto-generated method stub
		this.setEstado(true);
		return true;
	}
	
}
