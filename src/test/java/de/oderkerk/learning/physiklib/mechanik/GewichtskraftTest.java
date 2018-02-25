package de.oderkerk.learning.physiklib.mechanik;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GewichtskraftTest {

	private final BigDecimal MASSE = BigDecimal.valueOf(1);
	private final BigDecimal FALLBESCHLEUNIGUNG = BigDecimal.valueOf(9.81);
	private final BigDecimal GEWICHTSKRAFT = BigDecimal.valueOf(9.81);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBerechneGewichtskraft() throws Exception {
		assertEquals(GEWICHTSKRAFT, Gewichtskraft.berechneGewichtskraft(MASSE, FALLBESCHLEUNIGUNG));
	}

	@Test
	public void testBerechneMasse() throws Exception {
		assertEquals(MASSE, Gewichtskraft.berechneMasse(GEWICHTSKRAFT, FALLBESCHLEUNIGUNG));
	}

	@Test
	public void testBerechneFallbeschleunigung() throws Exception {
		assertEquals(FALLBESCHLEUNIGUNG, Gewichtskraft.berechneFallbeschleunigung(GEWICHTSKRAFT, MASSE));
	}

}
