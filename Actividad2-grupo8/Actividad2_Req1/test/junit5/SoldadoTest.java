package junit5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Importamos la clase Soldado
import programa.Soldado;

class SoldadoTest {

	/**
	 * Para el método isEstaMuerto al menos hay que probar 2 casos.
	 * Probamos cuando no está muerto que será false.
	 */
	
	@Test
	public void testNoEstaMuerto() {
		Soldado soldado = new Soldado(false,0);
		
		assertFalse(soldado.isEstaMuerto());
	}
	
	/**
	 * Probamos cuando está muerto que será true.
	 */
	@Test
	public void testEstaMuerto() {
		Soldado soldado = new Soldado(true,0);
		
		assertTrue(soldado.isEstaMuerto());
	}
	
	/**
	 * Para el método getNumeroBalas() al menos hay que probar 2 casos.
	 * Probamos cuando no tiene balas.
	 */
	@Test
	public void testNoTieneBalas() {
		Soldado soldado = new Soldado(false,0);
		soldado.setNumeroBalas(0);
		
		int resultadoEsperado = 0;
		int resultado = soldado.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	/**
	 * Probamos cuando recargamos balas.
	 */
	@Test
	public void testTieneBalas() {
		Soldado soldado = new Soldado(false,10);

		int resultadoEsperado = 10;
		int resultado = soldado.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * Para el método puedeDisparar() al menos hay que probar 2 casos.
	 * Si no tiene balas. Es false
	 * Si tiene balas puede disparar. Es true
	 */
	@Test
	public void testPuedeDisparar() {
		Soldado soldado = new Soldado(false,0);
	
		assertFalse(soldado.puedeDisparar());	
		
		soldado.setNumeroBalas(10);
		
		assertTrue(soldado.puedeDisparar());
	}
	
	/**
	 * Para el método disparar(Soldado soldado) hay que probar:
	 * Cuando no tiene balas. No lo mata.
	 * Cuando tiene balas lo mata.
	 * Además podemos ver las balas que le quedan.
	 * 
	 * He añadido en el método de dispara() una condición.
	 * Si tiene balas mata y resta y si no no hace nada.
	 * 
	 */
	@Test
	public void testDisparaNoMata() {
		Soldado soldadoA = new Soldado(false,0);
		Soldado soldadoB = new Soldado(false,0);
		
		soldadoA.disparar(soldadoB);
		assertFalse(soldadoB.isEstaMuerto());
		
		int resultadoEsperado = 0;
		int resultado = soldadoA.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDisparaMata() {
		Soldado soldadoA = new Soldado(false,0);
		Soldado soldadoB = new Soldado(false,0);
		soldadoB.setNumeroBalas(10);
		soldadoB.disparar(soldadoA);
		
		assertTrue(soldadoA.isEstaMuerto());
		
		int resultadoEsperadoB = 9;
		int resultadoB = soldadoB.getNumeroBalas();
		
		assertEquals(resultadoEsperadoB, resultadoB);

	}

}
