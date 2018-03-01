
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
 * Berechnungen zum Drehmoment
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Drehmoment {
	private static Logger logger = LoggerFactory.getLogger(Drehmoment.class);

	/**
	 * Berechnung des Drehmoments
	 * 
	 * @param hebelarm
	 *            in m
	 * @param kraft
	 *            in N
	 * @return drehmoment in Nm
	 */
	public static BigDecimal berechneDrehmoment(BigDecimal hebelarm, BigDecimal kraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Drehmoment mit Hebelarm = {} und Kraft = {}", hebelarm.toPlainString(),
					kraft.toPlainString());
		BigDecimal result = hebelarm.multiply(kraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} Nm", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Kraft
	 * 
	 * @param hebelarm
	 *            in m
	 * @param drehmoment
	 *            in Nm
	 * @return kraft in N
	 */
	public static BigDecimal berechneKraft(BigDecimal hebelarm, BigDecimal drehmoment) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Drehmoment mit Hebelarm = {} und Drehmoment = {}", hebelarm.toPlainString(),
					drehmoment.toPlainString());
		BigDecimal result = drehmoment.divide(hebelarm);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung des Hebelarms
	 * 
	 * @param kraft
	 *            in N
	 * @param drehmoment
	 *            in Nm
	 * @return hebelarm in m
	 */
	public static BigDecimal berechneHebelarm(BigDecimal kraft, BigDecimal drehmoment) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Drehmoment mit Kraft = {} und Drehmoment = {}", kraft.toPlainString(),
					drehmoment.toPlainString());
		BigDecimal result = drehmoment.divide(kraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}

}
