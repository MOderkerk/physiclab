package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class DrehmomentTest extends TestCase {

	private final BigDecimal HEBELARM = BigDecimal.valueOf(3);
	private final BigDecimal DREHMOMENT = BigDecimal.valueOf(6);
	private final BigDecimal KRAFT = BigDecimal.valueOf(2);

	@Test
	public void testBerechneDrehmoment() throws Exception {
		assertEquals(DREHMOMENT, Drehmoment.berechneDrehmoment(HEBELARM, KRAFT));
	}

	@Test
	public void testBerechneKraft() throws Exception {
		assertEquals(KRAFT, Drehmoment.berechneKraft(HEBELARM, DREHMOMENT));
	}

	@Test
	public void testBerechneHebelarm() throws Exception {
		assertEquals(HEBELARM, Drehmoment.berechneHebelarm(KRAFT, DREHMOMENT));
	}

}
