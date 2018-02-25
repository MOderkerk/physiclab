package de.oderkerk.learning.physiklib.mechanik;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DichteTest {

	private final BigDecimal MASSE = BigDecimal.valueOf(4);
	private final BigDecimal VOLUMEN = BigDecimal.valueOf(2);
	private final BigDecimal DICHTE = BigDecimal.valueOf(2);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBerechneDichte() throws Exception {
		assertEquals(DICHTE, Dichte.berechneDichte(MASSE, VOLUMEN));
	}

	@Test
	public void testBerechneMasse() throws Exception {
		assertEquals(MASSE, Dichte.berechneMasse(VOLUMEN, DICHTE));
	}

	@Test
	public void testBerechneVolumen() throws Exception {
		assertEquals(VOLUMEN, Dichte.berechneVolumen(MASSE, DICHTE));
	}

}
