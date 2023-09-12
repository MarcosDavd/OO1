package ar.edu.unlp.info.oo1.Ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

  private Producto queso;
  
  @BeforeEach
  void setUp() throws Exception {
    queso = new Producto();
  }

  @Test
  void testDescripcion() {
    queso.setDescripcion("Queso crema");
    assertEquals("Queso crema", queso.getDescripcion());
  }
  
  @Test
  void testPeso() {
    queso.setPeso(100);
    assertEquals(100, queso.getPeso());
  }

  @Test
  void testPrecioPorKilo() {
    queso.setPrecioPorKilo(100);
    assertEquals(100, queso.getPrecioPorKilo());
  }

  @Test
  void testPrecio() {
    queso.setPeso(0.1);
    queso.setPrecioPorKilo(140);
    //verificar el uso del setPrecio y del getPrecio
    // el valor antes eviado era 14 , ver modificaciones en set precio
    assertEquals(140, queso.getPrecioPorKilo());
  }
}
