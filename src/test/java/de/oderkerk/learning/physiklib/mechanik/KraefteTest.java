package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class KraefteTest extends TestCase {

	public void testBerechneResultierendeKraft() throws Exception {
		List<BigDecimal> werte = new ArrayList<BigDecimal>();
		werte.add(BigDecimal.valueOf(1));
		werte.add(BigDecimal.valueOf(2));
		werte.add(BigDecimal.valueOf(3));
		assertEquals(BigDecimal.valueOf(6), Kraefte.berechneResultierendeKraft(werte));
	}

}
