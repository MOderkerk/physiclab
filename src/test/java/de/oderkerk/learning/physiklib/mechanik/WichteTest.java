package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class WichteTest extends TestCase {

	BigDecimal wichte = BigDecimal.valueOf(2);
	BigDecimal volumen = BigDecimal.valueOf(2);
	BigDecimal gewichtskraft = BigDecimal.valueOf(4);

	@Test
	public void testBerechneWichte() throws Exception {
		assertEquals(wichte, Wichte.berechneWichte(gewichtskraft, volumen));
	}

	@Test
	public void testBerechneVolumen() throws Exception {
		assertEquals(volumen, Wichte.berechneVolumen(gewichtskraft, wichte));
	}

	@Test
	public void testBerechneGewichtskraft() throws Exception {
		assertEquals(gewichtskraft, Wichte.berechneGewichtskraft(volumen, wichte));
	}

}
