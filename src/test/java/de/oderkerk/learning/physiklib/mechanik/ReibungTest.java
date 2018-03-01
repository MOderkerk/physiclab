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

public class ReibungTest extends TestCase {
	private final BigDecimal REIBUNGSKRAFT = BigDecimal.valueOf(4);
	private final BigDecimal REIBUNGSZAHL = BigDecimal.valueOf(2);
	private final BigDecimal NORMALKRAFT = BigDecimal.valueOf(2);

	@Test
	public void testBerechneReibungskraft() throws Exception {
		assertEquals(REIBUNGSKRAFT, Reibung.berechneReibungskraft(REIBUNGSZAHL, NORMALKRAFT));
	}

	@Test
	public void testBerechneReibungszahl() throws Exception {
		assertEquals(REIBUNGSZAHL, Reibung.berechneReibungszahl(REIBUNGSKRAFT, NORMALKRAFT));
	}

	@Test
	public void testBerechneNormalkraft() throws Exception {
		assertEquals(NORMALKRAFT, Reibung.berechneNormalkraft(REIBUNGSKRAFT, REIBUNGSZAHL));
	}

}
