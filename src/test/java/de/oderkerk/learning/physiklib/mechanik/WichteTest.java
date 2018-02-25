package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class WichteTest extends TestCase {

	private final BigDecimal WICHTE = BigDecimal.valueOf(2);
	private final BigDecimal VOLUMEN = BigDecimal.valueOf(2);
	private final BigDecimal GEWICHTSKRAFT = BigDecimal.valueOf(4);

	@Test
	public void testBerechneWichte() throws Exception {
		assertEquals(WICHTE, Wichte.berechneWichte(GEWICHTSKRAFT, VOLUMEN));
	}

	@Test
	public void testBerechneVolumen() throws Exception {
		assertEquals(VOLUMEN, Wichte.berechneVolumen(GEWICHTSKRAFT, WICHTE));
	}

	@Test
	public void testBerechneGewichtskraft() throws Exception {
		assertEquals(GEWICHTSKRAFT, Wichte.berechneGewichtskraft(VOLUMEN, WICHTE));
	}

}
