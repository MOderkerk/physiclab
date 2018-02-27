package de.oderkerk.learning.physiklib.kinematik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class GeradlinigeBewegungTest extends TestCase {

	private final BigDecimal WEG = BigDecimal.valueOf(10);
	private final BigDecimal ZEIT = BigDecimal.valueOf(2);
	private final BigDecimal GESCHWINDIGKEIT = BigDecimal.valueOf(5);

	@Test
	public void testBerechneWeg() throws Exception {
		assertEquals(WEG, GeradlinigeBewegung.berechneWeg(ZEIT, GESCHWINDIGKEIT));
	}

	@Test
	public void testBerechneZeit() throws Exception {
		assertEquals(ZEIT, GeradlinigeBewegung.berechneZeit(WEG, GESCHWINDIGKEIT));
	}

	@Test
	public void testBerechneGeschwindigkeit() throws Exception {
		assertEquals(GESCHWINDIGKEIT, GeradlinigeBewegung.berechneGeschwindigkeit(WEG, ZEIT));
	}

}
