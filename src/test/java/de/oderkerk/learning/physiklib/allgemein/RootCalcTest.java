package de.oderkerk.learning.physiklib.allgemein;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class RootCalcTest extends TestCase {

	@Test
	public void testRoot() throws Exception {
		assertEquals(0, BigDecimal.valueOf(2.0).compareTo(RootCalc.root(BigDecimal.valueOf(4.0), 2)));
		assertEquals(0, BigDecimal.valueOf(0).compareTo(RootCalc.root(BigDecimal.valueOf(0), 2)));
		assertEquals(0, BigDecimal.valueOf(3).compareTo(RootCalc.root(BigDecimal.valueOf(9), 2)));
		assertEquals(0, BigDecimal.valueOf(3).compareTo(RootCalc.root(BigDecimal.valueOf(27), 3)));
	}

}
