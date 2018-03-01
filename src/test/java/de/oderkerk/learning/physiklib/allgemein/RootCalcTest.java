package de.oderkerk.learning.physiklib.allgemein;

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

public class RootCalcTest extends TestCase {

	@Test
	public void testRoot() throws Exception {
		assertEquals(0, BigDecimal.valueOf(2.0).compareTo(RootCalc.root(BigDecimal.valueOf(4.0), 2)));
		assertEquals(0, BigDecimal.valueOf(0).compareTo(RootCalc.root(BigDecimal.valueOf(0), 2)));
		assertEquals(0, BigDecimal.valueOf(3).compareTo(RootCalc.root(BigDecimal.valueOf(9), 2)));
		assertEquals(0, BigDecimal.valueOf(3).compareTo(RootCalc.root(BigDecimal.valueOf(27), 3)));
	}

}
