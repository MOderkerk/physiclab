
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
 * Berechnung der Wichte
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Wichte {
	private static Logger logger = LoggerFactory.getLogger(Wichte.class);

	private Wichte() {

	}

	/**
	 * Berechnung der Wichte mit Gewichtskraft und Volumen
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param volumen
	 *            in m?
	 * @return wichte in N/m?
	 */
	public static BigDecimal berechneWichte(BigDecimal gewichtskraft, BigDecimal volumen) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Wichte mit Gewichtskraft = {} und Volumen = {}", gewichtskraft.toPlainString(),
					volumen.toPlainString());

		BigDecimal result = gewichtskraft.divide(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N/m?", result);
		return result;

	}

	/**
	 * Berechnung des Volumens mit Wichte und Gewichtskraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param wichte
	 *            in N/m?
	 * @return volumen in m?
	 */
	public static BigDecimal berechneVolumen(BigDecimal gewichtskraft, BigDecimal wichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Gewichtskraft = {} und Wichte = {}", gewichtskraft.toPlainString(),
					wichte.toPlainString());

		BigDecimal result = gewichtskraft.divide(wichte);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m?", result);
		return result;

	}

	/**
	 * Berechnung der Geichtskraft mit Volumen und Wichte
	 * 
	 * @param volumen
	 *            m?
	 * @param wichte
	 *            N/m?
	 * @return gewichtskraft N
	 */
	public static BigDecimal berechneGewichtskraft(BigDecimal volumen, BigDecimal wichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Volumen = {} und Wichte = {}", volumen.toPlainString(),
					wichte.toPlainString());

		BigDecimal result = volumen.multiply(wichte);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;

	}
}
