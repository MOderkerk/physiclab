package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class SchweredruckTest extends TestCase {

	private final BigDecimal SCHWEREDRUCK = BigDecimal.valueOf(19.62);
	private final BigDecimal DICHTE = BigDecimal.valueOf(1);
	private final BigDecimal FALLBESCHLEUNIGUNG = BigDecimal.valueOf(9.81);
	private final BigDecimal HOEHE = BigDecimal.valueOf(2);

	@Test
	public void testBerechneSchweredruck() throws Exception {
		assertEquals(0, SCHWEREDRUCK.compareTo(Schweredruck.berechneSchweredruck(DICHTE, FALLBESCHLEUNIGUNG, HOEHE)));
	}

	@Test
	public void testBerechneDichte() throws Exception {
		assertEquals(0, DICHTE.compareTo(Schweredruck.berechneDichte(SCHWEREDRUCK, FALLBESCHLEUNIGUNG, HOEHE)));
	}

	@Test
	public void testBerechneHoehe() throws Exception {
		assertEquals(0, HOEHE.compareTo(Schweredruck.berechneHoehe(SCHWEREDRUCK, FALLBESCHLEUNIGUNG, DICHTE)));
	}

}
