package programa;
/**
 * <b>Clase Jugador</b>
 * <br>
 * En la clase Jugador vamos a poder crear jugadores.
 * Podremos ponerles número de dorsal, si tienen tarjetas amarillas o rojas y saber si está expulsado.
 * 
 * @author V_Lido
 *
 */
public class TestJugador {
/**
 * Testeamos que funcione todo correctamente.
 * 
 * @param args argumentos
 */
	public static void main(String[] args) {
		//Creamos jugadores
		Jugador jug1 = new Jugador(10, 1, 1);
		Jugador jug2 = new Jugador(30, 2, 0);
		Jugador jug3 = new Jugador();

		//Mostramos dorsales de jug1 y jug2
		System.out.println("El jugador 1 tiene el dorsal " + jug1.getDorsal());
		System.out.println("El jugador 2 tiene el dorsal " + jug2.getDorsal());
		
		//Ponemos dorsal al jugador 3
		jug3.ponerDorsal(2);
		System.out.println("El jugador 3 tiene el dorsal " + jug3.getDorsal());
		
		//Cambiamos dorsal al jugador 2 por un número fuera de rango
		jug2.ponerDorsal(40);
		System.out.println("El jugador 2 ahora tiene el dorsal " + jug2.getDorsal() + " por estar fuera de rango.");
		//Cambiamos dorsal al jugador 2 por un número dentro de rango
		jug2.ponerDorsal(13);
		System.out.println("El jugador 2 ahora tiene el dorsal " + jug2.getDorsal());
		
		//Tarjetas amarillas y tarjetas rojas
		System.out.println("EL jugador 1 tiene " + jug1.getNumeroTarjetasAmarillas() + " tarjetas amarillas y " + jug1.getNumeroTarjetasRojas() + " tarjetas rojas.");
		System.out.println("¿Está expulsado? " + jug1.estaExpulsado());
		System.out.println("EL jugador 2 tiene " + jug2.getNumeroTarjetasAmarillas() + " tarjetas amarillas y " + jug2.getNumeroTarjetasRojas() + " tarjetas rojas.");
		System.out.println("¿Está expulsado? " + jug2.estaExpulsado());
		
		//Añadimos tarjetas amarillas y rojas al jugador 3
		jug3.setNumeroTarjetasAmarillas(1);
		jug3.setNumeroTarjetasRojas(0);
		System.out.println("EL jugador 3 tiene " + jug3.getNumeroTarjetasAmarillas() + " tarjetas amarillas y " + jug3.getNumeroTarjetasRojas() + " tarjetas rojas.");
		System.out.println("¿Está expulsado? " + jug3.estaExpulsado());
		
		
	}

}
