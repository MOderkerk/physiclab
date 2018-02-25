package de.oderkerk.learning.physiklib.mechanik;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DichteTest {

	private BigDecimal masse = BigDecimal.valueOf(4);
	private BigDecimal volumen = BigDecimal.valueOf(2);
	private BigDecimal dichte = BigDecimal.valueOf(2);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBerechneDichte() throws Exception {
		assertEquals(dichte, Dichte.berechneDichte(masse, volumen));
	}

	@Test
	public void testBerechneMasse() throws Exception {
		assertEquals(masse, Dichte.berechneMasse(volumen, dichte));
	}

	@Test
	public void testBerechneVolumen() throws Exception {
		assertEquals(volumen, Dichte.berechneVolumen(masse, dichte));
	}

}
