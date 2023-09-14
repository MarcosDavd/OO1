package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
		
		
		TareaSimple t=new TareaSimple("Comprar Utiles Escolares","Comprar Utiles solo para un semestre");
		TareaCompleja tc= new TareaCompleja("Estudiar Para AYED", "Parcial de Grafos y TE fecha 28/6", "Parciales.pdf");
		
		LocalDate fecha = LocalDate.of(2023, Month.JUNE, 24);
		t.agregarEtiqueta("Escuela");
		t.establecerFechaDeVencimiento(fecha);
		
		System.out.println("Datos");
		System.out.println("Titulo : "+t.getTitulo());
		System.out.println("Descripcion : "+t.getDescripcion());
		System.out.println("Fecha : "+t.getFechacencimiento());
		System.out.println("Etiqueta : "+ t.getEtiqueta());
		if(t.getEstado()) {
			System.out.println("Estado : realizada");
		}else{
			System.out.println("Estado : no realizada");
		}
		
		// agrgegando Tareas a una tarea compleja
		tc.agregarEtiqueta("Parcial");
		tc.establecerFechaDeVencimiento(fecha);
		
		System.out.println("------- Datos de tarea compleja -------");
		System.out.println();
		System.out.println("Titulo : "+tc.getTitulo());
		System.out.println("  Descripcion :"+ tc.getDescripcion());
		System.out.println("  Adjunto : "+ tc.getAdjunto());
		System.out.println("  Fecha de vencimiento : "+tc.getFechacencimiento());
		System.out.println("  Etiqueta : "+ tc.getEtiqueta());
		if(tc.getEstado()) {
			System.out.println("  Estado : realizada");
		}else{
			System.out.println("  Estado : "+red +"no realizada"+reset);
		}
		
		
		// lista de tareas de un Proyecto
		List<Tarea> dependencias= new ArrayList<>();
		dependencias.add(tc);
		dependencias.add(t);
		dependencias.add(tc);
		dependencias.add(t);
		//crear proyectos 
		System.out.println("---------------Informacion de un Proyecto ------------");
		Proyecto p= new Proyecto("Parciales 3er semestre","Parciales que tengo que preparar",dependencias);
		System.out.println("  Titulo : "+green+p.getTitulo()+reset);
		System.out.println("  Descripcion : "+ green+p.getDescripcion()+reset);
		if(p.getTareas().size() < 3) {
			System.out.println("  Cantidad de tareas : "+green+p.getTareas().size()+reset);
		}else {
			System.out.println("  Cantidad de tareas : "+red+p.getTareas().size()+red+"!!!"+reset);
		}
		
	
	}
}
