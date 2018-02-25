package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class ReibungTest extends TestCase {
	private final BigDecimal REIBUNGSKRAFT = BigDecimal.valueOf(4);
	private final BigDecimal REIBUNGSZAHL = BigDecimal.valueOf(2);
	private final BigDecimal NORMALKRAFT = BigDecimal.valueOf(2);

	@Test
	public void testBerechneReibungskraft() throws Exception {
		assertEquals(REIBUNGSKRAFT, Reibung.berechneReibungskraft(REIBUNGSZAHL, NORMALKRAFT));
	}

	@Test
	public void testBerechneReibungszahl() throws Exception {
		assertEquals(REIBUNGSZAHL, Reibung.berechneReibungszahl(REIBUNGSKRAFT, NORMALKRAFT));
	}

	@Test
	public void testBerechneNormalkraft() throws Exception {
		assertEquals(NORMALKRAFT, Reibung.berechneNormalkraft(REIBUNGSKRAFT, REIBUNGSZAHL));
	}

}
