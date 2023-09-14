package ar.edu.unlp.info.oo1.Parcial_Tareas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MainFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = 100 * 0.05;
		LocalDate fecha1= LocalDate.now();
		LocalDate fecha2= LocalDate.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()+2);
		System.out.println("Fecha 1 : "+ fecha1.getDayOfMonth() );
		System.out.println("Fecha 2 : "+fecha2.getDayOfMonth());
		long dias= ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Dias entre las dos fechas  : "+dias);
		System.out.println("Porciento : "+(100*5)/100 );
		
		
		
	}

}
