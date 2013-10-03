package edu.tallerweb.pptls;
import static org.junit.Assert.*;
import org.junit.Test;
public class PartidaTests {
	@Test
	public void queSpockVaporizaPiedra() {
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);
		assertEquals("tijera decapita lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
}