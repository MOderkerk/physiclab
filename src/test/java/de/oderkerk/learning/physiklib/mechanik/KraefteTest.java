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
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class KraefteTest extends TestCase {

	public void testBerechneResultierendeKraft() throws Exception {
		List<BigDecimal> werte = new ArrayList<BigDecimal>();
		werte.add(BigDecimal.valueOf(1));
		werte.add(BigDecimal.valueOf(2));
		werte.add(BigDecimal.valueOf(3));
		assertEquals(BigDecimal.valueOf(6), Kraefte.berechneResultierendeKraft(werte));
	}

}
