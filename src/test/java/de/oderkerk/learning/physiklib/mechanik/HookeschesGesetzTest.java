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

public class HookeschesGesetzTest extends TestCase {

	private final BigDecimal KRAFT = BigDecimal.valueOf(6);
	private final BigDecimal WEG = BigDecimal.valueOf(2);
	private final BigDecimal FEDERKONSTANTE = BigDecimal.valueOf(3);

	@Test
	public void testBerechneKraft() throws Exception {
		assertEquals(KRAFT, HookeschesGesetz.berechneKraft(FEDERKONSTANTE, WEG));
	}

	@Test
	public void testBerechneFederkonstante() throws Exception {
		assertEquals(FEDERKONSTANTE, HookeschesGesetz.berechneFederkonstante(KRAFT, WEG));
	}

	@Test
	public void testBerechneWeg() throws Exception {
		assertEquals(WEG, HookeschesGesetz.berechneWeg(KRAFT, FEDERKONSTANTE));
	}

}
