package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class ReibungTest extends TestCase {
	private BigDecimal reibungskraft = BigDecimal.valueOf(4);
	private BigDecimal reibungszahl = BigDecimal.valueOf(2);
	private BigDecimal normalkraft = BigDecimal.valueOf(2);

	@Test
	public void testBerechneReibungskraft() throws Exception {
		assertEquals(reibungskraft, Reibung.berechneReibungskraft(reibungszahl, normalkraft));
	}

	@Test
	public void testBerechneReibungszahl() throws Exception {
		assertEquals(reibungszahl, Reibung.berechneReibungszahl(reibungskraft, normalkraft));
	}

	@Test
	public void testBerechneNormalkraft() throws Exception {
		assertEquals(normalkraft, Reibung.berechneNormalkraft(reibungskraft, reibungszahl));
	}

}
