
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
 * Dichteberechnungen
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Dichte {

	private static Logger logger = LoggerFactory.getLogger(Dichte.class);

	private Dichte() {

	}

	/**
	 * Berechne die Dichte anhand Masse und Volumen
	 * 
	 * @param masse
	 *            in kg
	 * @param volumen
	 *            m?
	 * @return Dichte in kg/m?
	 */
	public static BigDecimal berechneDichte(BigDecimal masse, BigDecimal volumen) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Masse = {} und Volumen = {}", masse.toPlainString(),
					volumen.toPlainString());
		BigDecimal result = masse.divide(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m?", result.toPlainString());
		return result;
	}

	/**
	 * Berechne die Masse anhand Dichte und Volumen
	 * 
	 * @param volumen
	 *            in m?
	 * @param dichte
	 *            in kg/m?
	 * @return masse in kg
	 */
	public static BigDecimal berechneMasse(BigDecimal volumen, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Masse mit Dichte = {} und Volumen = {}", dichte.toPlainString(),
					volumen.toPlainString());
		BigDecimal result = dichte.multiply(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} in kg", result.toPlainString());
		return result;
	}

	/**
	 * Berechne das Volumen anhand von Masse und Dichte
	 * 
	 * @param masse
	 *            in kg
	 * @param dichte
	 *            in kg/m?
	 * @return valumen m?
	 */
	public static BigDecimal berechneVolumen(BigDecimal masse, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Dichte = {} und Masse = {}", masse.toPlainString(),
					dichte.toPlainString());
		BigDecimal result = masse.divide(dichte);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} in m?", result.toPlainString());
		return result;
	}

}
