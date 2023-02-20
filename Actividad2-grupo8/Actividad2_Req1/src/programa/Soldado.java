package programa;
/**
	 * Clase Soldado. En ella podremos crear soldados, cargar de balas y matar otros soldados.
	 * <br>
	 * <b>Atributos de la clase Soldado</b>
	 * <ul>
	 * <li>estaMuerto</li>
	 * <li>numeroBalas</li>
	 * </ul>
	 * 
	 * @author V_Lido
	 * @version 1.0
	 *
	 */
public class Soldado {
		/**
		 * Atributo booleano para saber si está muerto o no
		 */
		private boolean estaMuerto;
		/**
		 * Atributo entero para saber la cantidad de balas que tiene un soldado
		 */
	    private int numeroBalas;
	    
	    /**
	     * Constructor vacío
	     */
	    public Soldado() {
			super();
		}
	    
	    /**
	     * Constructor con todos los atributos
	     * 
	     * @param estaMuerto es boolean, está muerta o no
	     * @param numeroBalas cantidad de balas
	     */
		public Soldado(boolean estaMuerto, int numeroBalas) {
			super();
			this.estaMuerto = estaMuerto;
			this.numeroBalas = numeroBalas;
		}

		//GETTER AND SETTER
		public boolean isEstaMuerto() {
			return estaMuerto;
		}
		public void setEstaMuerto(boolean estaMuerto) {
			this.estaMuerto = estaMuerto;
		}
		public int getNumeroBalas() {
			return numeroBalas;
		}
		public void setNumeroBalas(int numeroBalas) {
			this.numeroBalas = numeroBalas;
		}
	    
		//MÉTODOS
		/**
		 * Esté método lo que hace es que si el número de balas es mayor que 0 devuelve <b>true</b>
		 * porque tiene balas y puede disparar. Si no devuelve <b>false</b> y no puede disparar.
		 * @return <b>true</b> si tiene balas y <b>false</b> si no tiene balas
		 */
		public boolean puedeDisparar() {
	        if(this.numeroBalas > 0) {
	        	return true;
	        }                      
	        return false;
		}

		/**
		 * Con este método podemos disparar a otro soldado. Cada vez que dispara resta balas,
		 * con lo cual cada vez que lo ejecutemos tendrá menos.
		 * <br>
		 * Además, si tiene balas matará a un soldado, si no tiene no podrá matarlo.
		 * @param sol en este parámetro le pasaremos un soldado al que va a matar o no.
		 */
		public void disparar(Soldado sol) {
			//He añadido esta condición para que si no tiene balas no mate al otro soldado
			if(this.numeroBalas > 0) {
				this.numeroBalas--;
				sol.estaMuerto = true;
			}
		}

}
