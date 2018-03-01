
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
 * Brechnungen zum Druck
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Druck {
	private static Logger logger = LoggerFactory.getLogger(Druck.class);

	/**
	 * Berechnung des Drucks
	 * 
	 * @param flaeche
	 *            in m?
	 * @param kraft
	 *            in N
	 * @return druck in Pa
	 */
	public static BigDecimal berechneDruck(BigDecimal flaeche, BigDecimal kraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Druck mit Fl?che = {} und Kraft = {}", flaeche.toPlainString(),
					kraft.toPlainString());
		BigDecimal result = kraft.divide(flaeche);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} Pa", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Fl?che
	 * 
	 * @param druck
	 *            in Pa
	 * @param kraft
	 *            in N
	 * @return flaeche in m?
	 */
	public static BigDecimal berechneFlaeche(BigDecimal druck, BigDecimal kraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Fl?che mit Druck = {} und Kraft = {}", druck.toPlainString(), kraft.toPlainString());
		BigDecimal result = kraft.divide(druck);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m?", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Kraft
	 * 
	 * @param druck
	 *            in Pa
	 * @param flaeche
	 *            in m?
	 * @return fraft in N
	 */
	public static BigDecimal berechneKraft(BigDecimal druck, BigDecimal flaeche) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Kraft mit Druck = {} und Fl?che = {}", druck.toPlainString(),
					flaeche.toPlainString());
		BigDecimal result = druck.multiply(flaeche);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result.toPlainString());
		return result;
	}
}
