
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





import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

/**
 * @author Odin
 * @since 25.02.2018
 *
 */
public class KonstantenTest extends TestCase {

	Logger logger = LoggerFactory.getLogger(KonstantenTest.class);

	/**
	 *
	 * {@link de.oderkerk.learning.physiklib.allgemein.Konstanten#toString()}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testToString() throws Exception {
		logger.debug("Lichtjahr " + Konstanten.LICHTJAHR.toEngineeringString());
		assertTrue(Konstanten.LICHTJAHR.toEngineeringString().equals("9.46050E+15"));
	}

}
