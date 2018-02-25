package de.oderkerk.learning.physiklib.mechanik;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GewichtskraftTest {

	private final BigDecimal masse = BigDecimal.valueOf(1);
	private final BigDecimal fallbeschleunigung = BigDecimal.valueOf(9.81);
	private final BigDecimal gewichtskraft = BigDecimal.valueOf(9.81);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBerechneGewichtskraft() throws Exception {
		assertEquals(gewichtskraft, Gewichtskraft.berechneGewichtskraft(masse, fallbeschleunigung));
	}

	@Test
	public void testBerechneMasse() throws Exception {
		assertEquals(masse, Gewichtskraft.berechneMasse(gewichtskraft, fallbeschleunigung));
	}

	@Test
	public void testBerechneFallbeschleunigung() throws Exception {
		assertEquals(fallbeschleunigung, Gewichtskraft.berechneFallbeschleunigung(gewichtskraft, masse));
	}

}
