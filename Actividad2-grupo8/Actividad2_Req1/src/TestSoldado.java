/**
 * <b>Clase Soldado</b>
 * <br>
 * En la clase Soldado vamos a poder crear soldados.
 * Podremos cargarles con balas, podrán matar a otro soldado y saber si está muerto o no.
 * 
 * @author V_Lido
 *
 */
public class TestSoldado {
	
	public static void main(String[] args) {
		//Creamos sol1 y sol2
		Soldado sol1 = new Soldado(false, 10);
		Soldado sol2 = new Soldado(false, 0);
		
		//Preguntamos si está muerto sol2
		System.out.println("¿Está muerto sol2? " + sol2.isEstaMuerto());
		
		//Preguntamos si pueden disparar. Sol1 tiene balas, sol2 no
		System.out.println("¿Puede disparar sol1? " + sol1.puedeDisparar() + ". Sol1 tiene " + sol1.getNumeroBalas() + " balas.");
		System.out.println("¿Puede disparar sol2? " + sol2.puedeDisparar() + ". Sol2 tiene " + sol2.getNumeroBalas() + " balas.");
		
		System.out.println("Sol2 dispara a sol1.");
		//Si sol2 puede disparar que dispare a sol1
		if (sol2.puedeDisparar())
			sol2.disparar(sol1);
		
		System.out.println("¿Está muerto sol1? " + sol1.isEstaMuerto());
		System.out.println("Sol2 tiene " + sol2.getNumeroBalas() + " balas y no puede matar.");
		
		System.out.println("Sol1 dispara a sol2.");
		//Si sol1 puede disparar que dispare a sol2
		if (sol1.puedeDisparar())
			sol1.disparar(sol2);
		
		System.out.println("¿Está muerto sol2? " + sol2.isEstaMuerto());
		System.out.println("Sol1 tiene ahora " + sol1.getNumeroBalas() + " balas.");
		

	}

}

