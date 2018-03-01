
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
 * Alle Berechnungen zum Thema Hookesches Gesetz
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class HookeschesGesetz {
	private static Logger logger = LoggerFactory.getLogger(HookeschesGesetz.class);

	/**
	 * Berechnung der Kraft
	 * 
	 * @param federkonstante
	 *            in N/m
	 * 
	 * @param weg
	 *            in m
	 * 
	 * @return kraft in N
	 */
	public static BigDecimal berechneKraft(BigDecimal federkonstante, BigDecimal weg) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Kraft mit Federkonstante = {} und Weg = {}", federkonstante.toPlainString(),
					weg.toPlainString());
		BigDecimal result = federkonstante.multiply(weg);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Federkonstanten
	 * 
	 * @param kraft
	 *            in N
	 * @param weg
	 *            in m
	 * @return federkonstante in N/m
	 */
	public static BigDecimal berechneFederkonstante(BigDecimal kraft, BigDecimal weg) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Federkonstante mit Kraft = {} und Weg = {}", kraft.toPlainString(),
					weg.toPlainString());
		BigDecimal result = kraft.divide(weg);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N/m", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung des Weges
	 * 
	 * @param kraft
	 *            in N
	 * @param federkonstante
	 *            in N/m
	 * @return weg in m
	 */
	public static BigDecimal berechneWeg(BigDecimal kraft, BigDecimal federkonstante) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Weg mit Kraft = {} und Federkonstante= {}", kraft.toPlainString(),
					federkonstante.toPlainString());
		BigDecimal result = kraft.divide(federkonstante);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}
}
