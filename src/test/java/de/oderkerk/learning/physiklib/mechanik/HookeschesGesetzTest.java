package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class HookeschesGesetzTest extends TestCase {

	private final BigDecimal KRAFT = BigDecimal.valueOf(6);
	private final BigDecimal WEG = BigDecimal.valueOf(2);
	private final BigDecimal FEDERKONSTANTE = BigDecimal.valueOf(3);

	@Test
	public void testBerechneKraft() throws Exception {
		assertEquals(KRAFT, HookeschesGesetz.berechneKraft(FEDERKONSTANTE, WEG));
	}

	@Test
	public void testBerechneFederkonstante() throws Exception {
		assertEquals(FEDERKONSTANTE, HookeschesGesetz.berechneFederkonstante(KRAFT, WEG));
	}

	@Test
	public void testBerechneWeg() throws Exception {
		assertEquals(WEG, HookeschesGesetz.berechneWeg(KRAFT, FEDERKONSTANTE));
	}

}
