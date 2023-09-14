package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea{
	private String adjunto;
	private List<Tarea> dependencias;
	
	
	
	public TareaCompleja(String titulo,String descripcion,String adjunto) {
		this.adjunto=adjunto;
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.dependencias=new ArrayList<>();		
		this.setEstado(false);
	}
		
	public String getAdjunto() {
		return adjunto;
	}

	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
	}

	public void setDependencias(List<Tarea> dependencias) {
		this.dependencias = dependencias;
	}

	@Override
	public void establecerFechaDeVencimiento(LocalDate fecha) {
		// TODO Auto-generated method stub
		this.setFechavencimiento(fecha);
	}

	@Override
	public void agregarEtiqueta(String etiqueta) {
		// TODO Auto-generated method stub
		this.setEtiqueta(etiqueta);
	}
	public void setDependecias(Tarea tarea) {
		this.dependencias.add(tarea);
	}
	public List<Tarea> getDependencias(){
		return this.dependencias;
	}

	@Override
	public boolean marcarComoCompleta() {
		// TODO Auto-generated method stub
		if(this.dependencias.stream().anyMatch(tarea -> tarea.getEstado()== false)) {
			return false;
		}else {
			this.setEstado(true);
			return true;
		}
	}
	public void editarTarea(String titulo, String descripcion,String adjunto,Tarea tarea) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setAdjunto(adjunto);
		this.dependencias.add(tarea);
		this.setEstado(false);
	}

}
