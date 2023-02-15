/**
 * Creamos una clase Jugador con la que podremos crear jugadores. Saber cantidad de tarjetas amarillas, tarjetas rojas y expulsarlos.
 * <br>
 * <b>Atributos de la clase Jugador</b>
 * <ul>
 * <li>dorsal</li>
 * <li>numeroTarjetasAmarillas</li>
 * <li>numeroTarjetasRojas</li>
 * </ul>
 * @author V_Lido
 *
 */
public class Jugador {
	/**
	 * Atributo entero para saber el número de dorsal que lleva
	 */
	private int dorsal;
	/**
	 * Atributo entero para saber la cantidad de tarjetas amarillas que tiene.
	 */
    private int numeroTarjetasAmarillas;
    /**
     * Atributo entero para saber la cantidad de tarjetas rojas que tiene.
     */
    private int numeroTarjetasRojas;
    
    /**
     * Constructor vacío
     */
    public Jugador() {
		super();
	}

    /**
     * Constructor con todos los atributos
     * 
     * @param dorsal entero, número de dorsal
     * @param numeroTarjetasAmarillas entero, cantidad de tarjetas amarillas
     * @param numeroTarjetasRojas entero, cantidad de tarjetas rojas
     */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	//GETTER AND SETTER
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
    
	//MÉTODOS
	/**
	 * En este método recibirá un número de dorsal.
	 * <br>
	 * Si el número está entre 1 y 30, el dorsal pasará a ser dicho entero.
	 * Si el número no está en ese rango devolverá -1.
	 * @param dorsal recibirá el número de dorsal 
	 */
	public void ponerDorsal(int dorsal) {
        if(dorsal >= 1 && dorsal <= 30) {
        	this.dorsal = dorsal;
        }else {
            this.dorsal = -1;
        }

	}
	
	/**
	 * En este método podremos expulsar a un jugador.
	 * <br>
	 * Si el número de tarjetas amarillas que tiene es igual a 2 es <b>true</b> y será expulsado.
	 * <br>
	 * Si el número de tarjetas rojas que tiene es igual a 1 es <b>true</b> y será expulsado.
	 * @return será expulsado o no
	 */
	public boolean estaExpulsado() {
        boolean expulsado = false;                                                  
        if(numeroTarjetasAmarillas == 2) {
             expulsado = true;
        }                          
        if(numeroTarjetasRojas == 1) {
             expulsado = true;
        }                          
        return expulsado;

	}            

    
}
