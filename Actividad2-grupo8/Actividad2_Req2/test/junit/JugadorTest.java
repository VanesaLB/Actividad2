package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Jugador;

class JugadorTest {

	/**
	 * En este método recibirá un número de dorsal que debe estar entre 1 y 30.
	 * Haremos 3 pruebas:
	 * Si el número es menor que 1 devolverá -1.
	 * Si el número está entre 1 y 30, el dorsal pasará a ser dicho entero.
	 * Si el número es mayor que 30 devolverá -1.
	 */
	@Test
	public void testDorsalMenor() {
		Jugador jugador = new Jugador();
		
		jugador.ponerDorsal(0);
		
		int resultadoEsperado = -1;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDorsalRango() {
		Jugador jugador = new Jugador();
		jugador.ponerDorsal(10);
		
		int resultadoEsperado = 10;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDorsalMayor() {
		Jugador jugador = new Jugador();
		jugador.ponerDorsal(40);
		
		int resultadoEsperado = -1;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * En este método podremos expulsar a un jugador.
	 * Haremos las siguientes pruebas:
	 * Si el número de tarjetas amarillas que tiene es menor que 2 es false y no será expulsado.
	 * Si el número de tarjetas amarillas que tiene es igual a 2 es true y será expulsado.
	 * Si el número de tarjetas rojas que tiene es menor que 1 es false y no será expulsado.
	 * Si el número de tarjetas rojas que tiene es igual a 1 es true y será expulsado.
	 */
	@Test
	public void testAmarillasNoExpulsar() {
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasAmarillas(1);
		
		assertFalse(jugador.estaExpulsado());
	}
	
	@Test
	public void testAmarillasExpulsar() {
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasAmarillas(2);
		
		assertTrue(jugador.estaExpulsado());
	}
	
	@Test
	public void testRojasNoExpulsar() {
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasRojas(0);
		
		assertFalse(jugador.estaExpulsado());
	}
	
	@Test
	public void testRojasExpulsar() {
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasRojas(1);
		
		assertTrue(jugador.estaExpulsado());
	}

}
