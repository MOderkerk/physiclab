/**
 * 
 */
package de.oderkerk.learning.physiklib.allgemein;

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
	 * Test method for
	 * {@link de.oderkerk.learning.physiklib.allgemein.Konstanten#toString()}.
	 */
	@Test
	public void testToString() throws Exception {
		logger.debug("Lichtjahr " + Konstanten.LICHTJAHR.toEngineeringString());
		assertTrue(Konstanten.LICHTJAHR.toEngineeringString().equals("9.46050E+15"));
	}

}
