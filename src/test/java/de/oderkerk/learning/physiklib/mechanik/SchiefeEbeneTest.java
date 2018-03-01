package de.oderkerk.learning.physiklib.mechanik;

/*-
 * #%L
 * physicslib
 * %%
 * Copyright (C) 2018 Marco Oderkerk
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */







import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.TestCase;

public class SchiefeEbeneTest extends TestCase {

	private final BigDecimal HANGABTRIEBSKRAFT = BigDecimal.valueOf(2);
	private final BigDecimal NORMALKRAFTft = BigDecimal.valueOf(2);
	private final BigDecimal GEWICHTSKRAFT = BigDecimal.valueOf(2);
	private final BigDecimal HOEHE = BigDecimal.valueOf(2);
	private final BigDecimal LAENGE = BigDecimal.valueOf(2);
	private final BigDecimal breite = BigDecimal.valueOf(2);

	@Test
	public void testBerechneHangabtriebskraft() throws Exception {
		assertEquals(HANGABTRIEBSKRAFT, SchiefeEbene.berechneHangabtriebskraft(GEWICHTSKRAFT, HOEHE, LAENGE));
	}

	@Test
	public void testBerechneGewichtskraftUeberHangabtriebskraft() throws Exception {
		assertEquals(GEWICHTSKRAFT,
				SchiefeEbene.berechneGewichtskraftUeberHangabtriebskraft(HANGABTRIEBSKRAFT, HOEHE, LAENGE));
	}

	@Test
	public void testBerechneHoehe() throws Exception {
		assertEquals(HOEHE, SchiefeEbene.berechneHoehe(HANGABTRIEBSKRAFT, GEWICHTSKRAFT, LAENGE));
	}

	@Test
	public void testBerechneLaengeUeberHangabtriebskraft() throws Exception {
		assertEquals(LAENGE,
				SchiefeEbene.berechneLaengeUeberHangabtriebskraft(HANGABTRIEBSKRAFT, GEWICHTSKRAFT, HOEHE));
	}

	@Test
	public void testBerechneNormalkraft() throws Exception {
		assertEquals(NORMALKRAFTft, SchiefeEbene.berechneNormalkraft(GEWICHTSKRAFT, LAENGE, breite));
	}

	@Test
	public void testBerechneGewichtskraftUeberNormalkraft() throws Exception {
		assertEquals(GEWICHTSKRAFT, SchiefeEbene.berechneGewichtskraftUeberNormalkraft(NORMALKRAFTft, LAENGE, breite));
	}

	@Test
	public void testBerechneBreite() throws Exception {
		assertEquals(breite, SchiefeEbene.berechneBreite(NORMALKRAFTft, LAENGE, GEWICHTSKRAFT));
	}

	@Test
	public void testBerechneLaengeUeberNormalkraft() throws Exception {
		assertEquals(LAENGE, SchiefeEbene.berechneLaengeUeberNormalkraft(NORMALKRAFTft, breite, GEWICHTSKRAFT));
	}

}
