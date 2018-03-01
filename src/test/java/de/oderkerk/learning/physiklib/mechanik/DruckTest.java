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

public class DruckTest extends TestCase {

	private final BigDecimal DRUCK = BigDecimal.valueOf(2);
	private final BigDecimal KRAFT = BigDecimal.valueOf(4);
	private final BigDecimal FLAECHE = BigDecimal.valueOf(2);

	@Test
	public void testBerechneDruck() throws Exception {
		assertEquals(DRUCK, Druck.berechneDruck(FLAECHE, KRAFT));
	}

	@Test
	public void testBerechneFlaeche() throws Exception {
		assertEquals(FLAECHE, Druck.berechneFlaeche(DRUCK, KRAFT));
	}

	@Test
	public void testBerechneKraft() throws Exception {
		assertEquals(KRAFT, Druck.berechneKraft(DRUCK, FLAECHE));
	}

}
