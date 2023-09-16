package examen;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PagareTest {
	private Pagare pagareVigente, pagareVencido;
	
	@BeforeEach
	void setUp() {
		pagareVigente = new Pagare(100.0, "Jorge", "Claudio", LocalDate.now(), LocalDate.now().plusDays(1));
		pagareVencido = new Pagare(100.0, "Jorge", "Claudio", LocalDate.now(), LocalDate.now());
	}
	
	@Test
	void testEstaVencido() {
		assertFalse(pagareVigente.estaVencido());
		assertTrue(pagareVencido.estaVencido());
	}
}
