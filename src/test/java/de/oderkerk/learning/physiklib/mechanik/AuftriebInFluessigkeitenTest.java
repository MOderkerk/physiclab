package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class AuftriebInFluessigkeitenTest extends TestCase {

	private final BigDecimal VOLUMEN = BigDecimal.valueOf(1);
	private final BigDecimal AUFTRIEBSKRAFT = BigDecimal.valueOf(98.10);
	private final BigDecimal FALLBESCHLEUNIGUNG = BigDecimal.valueOf(9.81);
	private final BigDecimal DICHTE = BigDecimal.valueOf(10);

	@Test
	public void testBerechneAuftriebskraft() throws Exception {
		assertTrue(AUFTRIEBSKRAFT
				.compareTo(AuftriebInFluessigkeiten.berechneAuftriebskraft(VOLUMEN, FALLBESCHLEUNIGUNG, DICHTE)) == 0);
	}

	@Test
	public void testBerechneDichte() throws Exception {
		assertEquals(DICHTE.toPlainString(),
				AuftriebInFluessigkeiten.berechneDichte(VOLUMEN, FALLBESCHLEUNIGUNG, AUFTRIEBSKRAFT).toPlainString());
	}

	@Test
	public void testBerechneVolumen() throws Exception {
		assertTrue(VOLUMEN
				.compareTo(AuftriebInFluessigkeiten.berechneVolumen(DICHTE, FALLBESCHLEUNIGUNG, AUFTRIEBSKRAFT)) == 0);
	}

}
