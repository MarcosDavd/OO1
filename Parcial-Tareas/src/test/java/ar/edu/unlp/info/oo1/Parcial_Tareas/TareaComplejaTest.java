package ar.edu.unlp.info.oo1.Parcial_Tareas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaComplejaTest {
	private TareaCompleja tc;
	private TareaSimple ts;
	private LocalDate fecha;
	private String e;
	private TareaSimple ts2;
	@BeforeEach
	public void setUp() {
		e= "Parcial";
		ts2=new TareaSimple("Parcial Teorico Arboles"," Estudiar heap ");
		tc = new TareaCompleja("Estudiar Para AYED", "Parcial de Grafos y TE fecha 28/6", "Parciales.pdf");
		ts=new TareaSimple("Proyecto Final JS"," Trabajo grupal ");
		fecha=LocalDate.of(2023, Month.JUNE, 24);;
		
	}
	
	@Test
	void testDependecias() {
		tc.setDependecias(ts);
		assertTrue(tc.getDependencias().contains(ts));
	}
	@Test
	void testFechaDeVencimiento() {
		tc.setFechavencimiento(fecha);
		assertTrue(tc.getFechacencimiento().equals(fecha));
	}
	@Test
	void testMarcarComocompleta() {
		ts.marcarComoCompleta();
		tc.setDependecias(ts);
		assertTrue(tc.marcarComoCompleta());
		
	}
	@Test
	void testEtiqueta() {
		tc.agregarEtiqueta(e);
		assertTrue(tc.getEtiqueta().equals(e));
	}
	@Test
	void testEditarTarea(){
		tc.editarTarea("Parcial Arboles", "Prepar AB AG", "Arboles.pdf", ts2);
		assertTrue(tc.getTitulo().equals("Parcial Arboles"));
		assertFalse(tc.getEstado());
		assertTrue(tc.getDependencias().contains(ts2));
		assertTrue(tc.getDescripcion().equals("Prepar AB AG"));
		assertTrue(tc.getAdjunto().equals("Arboles.pdf"));
	}
	
}
