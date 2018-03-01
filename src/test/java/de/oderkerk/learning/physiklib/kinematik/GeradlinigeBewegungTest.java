package de.oderkerk.learning.physiklib.kinematik;

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

public class GeradlinigeBewegungTest extends TestCase {

	private final BigDecimal WEG = BigDecimal.valueOf(10);
	private final BigDecimal ZEIT = BigDecimal.valueOf(2);
	private final BigDecimal GESCHWINDIGKEIT = BigDecimal.valueOf(5);

	@Test
	public void testBerechneWeg() throws Exception {
		assertEquals(WEG, GeradlinigeBewegung.berechneWeg(ZEIT, GESCHWINDIGKEIT));
	}

	@Test
	public void testBerechneZeit() throws Exception {
		assertEquals(ZEIT, GeradlinigeBewegung.berechneZeit(WEG, GESCHWINDIGKEIT));
	}

	@Test
	public void testBerechneGeschwindigkeit() throws Exception {
		assertEquals(GESCHWINDIGKEIT, GeradlinigeBewegung.berechneGeschwindigkeit(WEG, ZEIT));
	}

}
