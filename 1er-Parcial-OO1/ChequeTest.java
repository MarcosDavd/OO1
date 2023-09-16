package examen;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChequeTest {
	private Cheque chequeVigente, chequeVencido;
	
	@BeforeEach
	void setUp() {
		chequeVigente = new Cheque(100.0, "Jorge", "Claudio", LocalDate.now().minusDays(29));
		chequeVencido = new Cheque(100.0, "Jorge", "Claudio", LocalDate.now().minusDays(30));
	}
	
	@Test
	void testEstaVencido() {
		assertFalse(chequeVigente.estaVencido());
		assertTrue(chequeVencido.estaVencido());
	}
}
