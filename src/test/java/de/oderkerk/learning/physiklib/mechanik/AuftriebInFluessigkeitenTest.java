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
