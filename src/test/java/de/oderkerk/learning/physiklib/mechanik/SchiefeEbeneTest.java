package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class SchiefeEbeneTest extends TestCase {

	private BigDecimal hangabtriebskraft = BigDecimal.valueOf(2);
	private BigDecimal normalkraft = BigDecimal.valueOf(2);
	private BigDecimal gewichtskraft = BigDecimal.valueOf(2);
	private BigDecimal hoehe = BigDecimal.valueOf(2);
	private BigDecimal laenge = BigDecimal.valueOf(2);
	private BigDecimal breite = BigDecimal.valueOf(2);

	@Test
	public void testBerechneHangabtriebskraft() throws Exception {
		assertEquals(hangabtriebskraft, SchiefeEbene.berechneHangabtriebskraft(gewichtskraft, hoehe, laenge));
	}

	@Test
	public void testBerechneGewichtskraftUeberHangabtriebskraft() throws Exception {
		assertEquals(gewichtskraft,
				SchiefeEbene.berechneGewichtskraftUeberHangabtriebskraft(hangabtriebskraft, hoehe, laenge));
	}

	@Test
	public void testBerechneHoehe() throws Exception {
		assertEquals(hoehe, SchiefeEbene.berechneHoehe(hangabtriebskraft, gewichtskraft, laenge));
	}

	@Test
	public void testBerechneLaengeUeberHangabtriebskraft() throws Exception {
		assertEquals(laenge,
				SchiefeEbene.berechneLaengeUeberHangabtriebskraft(hangabtriebskraft, gewichtskraft, hoehe));
	}

	@Test
	public void testBerechneNormalkraft() throws Exception {
		assertEquals(normalkraft, SchiefeEbene.berechneNormalkraft(gewichtskraft, laenge, breite));
	}

	@Test
	public void testBerechneGewichtskraftUeberNormalkraft() throws Exception {
		assertEquals(gewichtskraft, SchiefeEbene.berechneGewichtskraftUeberNormalkraft(normalkraft, laenge, breite));
	}

	@Test
	public void testBerechneBreite() throws Exception {
		assertEquals(breite, SchiefeEbene.berechneBreite(normalkraft, laenge, gewichtskraft));
	}

	@Test
	public void testBerechneLaengeUeberNormalkraft() throws Exception {
		assertEquals(laenge, SchiefeEbene.berechneLaengeUeberNormalkraft(normalkraft, breite, gewichtskraft));
	}

}
