
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Berechnung zur Gewichtskraft Gewichtskraft = Masse * Fallgeschwindigkeit FG=
 * m * g
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Gewichtskraft {

	private static Logger logger = LoggerFactory.getLogger(Gewichtskraft.class);

	private Gewichtskraft() {

	}

	/**
	 * Berechne Gewichtskraft ?ber Masse und Fallgeschwindigkeit
	 * 
	 * @param masse
	 *            in kg
	 * @param fallbeschleunigung
	 *            in m/s
	 * @return Gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraft(BigDecimal masse, BigDecimal fallbeschleunigung) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Masse = {} in kg , Fallbeschleunigung = {} in m/s?",
					masse.toPlainString(), fallbeschleunigung.toPlainString());
		BigDecimal result = masse.multiply(fallbeschleunigung);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;

	}

	/**
	 * Berechnung der Masse ?ber Gewichtskraft und Fallgeschwindigkeit
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param fallbeschleunigung
	 *            in m/s
	 * @return Masse in kg
	 */
	public static BigDecimal berechneMasse(BigDecimal gewichtskraft, BigDecimal fallbeschleunigung) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Masse mit Gewichtskraft = {} in N , Fallbeschleunigung = {} in m/s?",
					gewichtskraft.toPlainString(), fallbeschleunigung.toPlainString());
		BigDecimal result = gewichtskraft.divide(fallbeschleunigung);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} KG", result);
		return result;

	}

	/**
	 * Berechnung der Fallbeschleunigung anhang Gewichtskraft und Masse
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param masse
	 *            in kg
	 * @return fallbeschleunigung in m/s?
	 */
	public static BigDecimal berechneFallbeschleunigung(BigDecimal gewichtskraft, BigDecimal masse) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Fallbeschleunigung mit Gewichtskraft = {} in N , Masse = {} in kg",
					gewichtskraft.toPlainString(), masse.toPlainString());
		BigDecimal result = gewichtskraft.divide(masse);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m/s?", result);
		return result;

	}
}
