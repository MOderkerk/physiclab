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

public class SchweredruckTest extends TestCase {

	private final BigDecimal SCHWEREDRUCK = BigDecimal.valueOf(19.62);
	private final BigDecimal DICHTE = BigDecimal.valueOf(1);
	private final BigDecimal FALLBESCHLEUNIGUNG = BigDecimal.valueOf(9.81);
	private final BigDecimal HOEHE = BigDecimal.valueOf(2);

	@Test
	public void testBerechneSchweredruck() throws Exception {
		assertEquals(0, SCHWEREDRUCK.compareTo(Schweredruck.berechneSchweredruck(DICHTE, FALLBESCHLEUNIGUNG, HOEHE)));
	}

	@Test
	public void testBerechneDichte() throws Exception {
		assertEquals(0, DICHTE.compareTo(Schweredruck.berechneDichte(SCHWEREDRUCK, FALLBESCHLEUNIGUNG, HOEHE)));
	}

	@Test
	public void testBerechneHoehe() throws Exception {
		assertEquals(0, HOEHE.compareTo(Schweredruck.berechneHoehe(SCHWEREDRUCK, FALLBESCHLEUNIGUNG, DICHTE)));
	}

}
