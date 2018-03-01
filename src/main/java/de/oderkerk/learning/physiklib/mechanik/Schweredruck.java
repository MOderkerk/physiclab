
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
 * Berechnungen f?r den Schweredruck
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Schweredruck {
	private static Logger logger = LoggerFactory.getLogger(Schweredruck.class);

	/**
	 * Berchnung des Schweredruck
	 * 
	 * @param dichte
	 *            kg/m?
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param hoehe
	 *            m
	 * @return schweredruck pa
	 */
	public static BigDecimal berechneSchweredruck(BigDecimal dichte, BigDecimal fallbeschleunigung, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Schweredruck mit Dichte = {} ,Fallbeschleunigung {} und H?he = {}",
					dichte.toPlainString(), fallbeschleunigung.toPlainString(), hoehe.toPlainString());
		BigDecimal result = dichte.multiply(fallbeschleunigung).multiply(hoehe);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} Pa", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Dichte
	 * 
	 * @param schweredruck
	 *            pa
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param hoehe
	 *            m
	 * @return dichte kg/m?
	 */
	public static BigDecimal berechneDichte(BigDecimal schweredruck, BigDecimal fallbeschleunigung, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Schweredruck = {} ,Fallbeschleunigung {} und H?he = {}",
					schweredruck.toPlainString(), fallbeschleunigung.toPlainString(), hoehe.toPlainString());
		BigDecimal result = schweredruck.divide((fallbeschleunigung.multiply(hoehe)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m?", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der H?he
	 * 
	 * @param schweredruck
	 *            pa
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param dichte
	 *            kg/m?
	 * @return hoehe m
	 */
	public static BigDecimal berechneHoehe(BigDecimal schweredruck, BigDecimal fallbeschleunigung, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Schweredruck = {} ,Fallbeschleunigung {} und Dichte = {}",
					schweredruck.toPlainString(), fallbeschleunigung.toPlainString(), dichte.toPlainString());
		BigDecimal result = schweredruck.divide((fallbeschleunigung.multiply(dichte)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}
}
