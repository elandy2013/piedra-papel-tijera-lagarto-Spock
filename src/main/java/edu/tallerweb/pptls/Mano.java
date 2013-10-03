package edu.tallerweb.pptls;
/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	public Mano(final Forma forma) {
		this.forma = forma;
	}
	public Resultado jugarCon(final Mano otra) {
		Resultado resultado = Resultado.EMPATA;
		switch (this.forma) {
			case PIEDRA:
				if (otra.forma == Forma.TIJERA || otra.forma == Forma.SPOCK) {
					resultado = Resultado.GANA;
				} else {
					resultado = Resultado.PIERDE;
				}
				break;
			case PAPEL:
				if (otra.forma == Forma.PIEDRA || otra.forma == Forma.LAGARTO) {
					resultado = Resultado.GANA;
				} else {
					resultado = Resultado.PIERDE;
				}
				break;
			case TIJERA:
				if (otra.forma == Forma.PAPEL || otra.forma == Forma.LAGARTO) {
					resultado = Resultado.GANA;
				} else {
					resultado = Resultado.PIERDE;
				}
				break;
			case LAGARTO:
				if (otra.forma == Forma.SPOCK || otra.forma == Forma.PAPEL) {
					resultado = Resultado.GANA;
				} else {
					resultado = Resultado.PIERDE;
				}
				break;
			case SPOCK:
				if (otra.forma == Forma.TIJERA || otra.forma == Forma.PIEDRA) {
					resultado = Resultado.GANA;
				} else {
					resultado = Resultado.PIERDE;
				}
				break;
		}
		if (this.forma == otra.forma) {
			resultado = Resultado.EMPATA;
		}
		return resultado;
	}
}