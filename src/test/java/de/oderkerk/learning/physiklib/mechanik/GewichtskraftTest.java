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






import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GewichtskraftTest {

	private final BigDecimal MASSE = BigDecimal.valueOf(1);
	private final BigDecimal FALLBESCHLEUNIGUNG = BigDecimal.valueOf(9.81);
	private final BigDecimal GEWICHTSKRAFT = BigDecimal.valueOf(9.81);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBerechneGewichtskraft() throws Exception {
		assertEquals(GEWICHTSKRAFT, Gewichtskraft.berechneGewichtskraft(MASSE, FALLBESCHLEUNIGUNG));
	}

	@Test
	public void testBerechneMasse() throws Exception {
		assertEquals(MASSE, Gewichtskraft.berechneMasse(GEWICHTSKRAFT, FALLBESCHLEUNIGUNG));
	}

	@Test
	public void testBerechneFallbeschleunigung() throws Exception {
		assertEquals(FALLBESCHLEUNIGUNG, Gewichtskraft.berechneFallbeschleunigung(GEWICHTSKRAFT, MASSE));
	}

}
