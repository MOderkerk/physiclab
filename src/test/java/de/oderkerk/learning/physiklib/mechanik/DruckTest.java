package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class DruckTest extends TestCase {

	private final BigDecimal DRUCK = BigDecimal.valueOf(2);
	private final BigDecimal KRAFT = BigDecimal.valueOf(4);
	private final BigDecimal FLAECHE = BigDecimal.valueOf(2);

	@Test
	public void testBerechneDruck() throws Exception {
		assertEquals(DRUCK, Druck.berechneDruck(FLAECHE, KRAFT));
	}

	@Test
	public void testBerechneFlaeche() throws Exception {
		assertEquals(FLAECHE, Druck.berechneFlaeche(DRUCK, KRAFT));
	}

	@Test
	public void testBerechneKraft() throws Exception {
		assertEquals(KRAFT, Druck.berechneKraft(DRUCK, FLAECHE));
	}

}
