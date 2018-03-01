
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
 * Berechnungen zum Thema Auftrieb in Fluessigkeiten
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class AuftriebInFluessigkeiten {
	private static Logger logger = LoggerFactory.getLogger(AuftriebInFluessigkeiten.class);

	/**
	 * Berechnung der Auftriebskraft
	 * 
	 * @param volumen
	 *            im m?
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param dichte
	 *            kg/m?
	 * @return N
	 */
	public static BigDecimal berechneAuftriebskraft(BigDecimal volumen, BigDecimal fallbeschleunigung,
			BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Auftrieb mit Volumen = {} , Fallbeschleunigung = {} und Dichte = {}",
					volumen.toPlainString(), fallbeschleunigung.toPlainString(), dichte.toPlainString());
		BigDecimal result = dichte.multiply(fallbeschleunigung).multiply(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Dichte
	 * 
	 * @param volumen
	 *            m?
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param auftriebskraft
	 *            N
	 * @return kg/m?
	 */
	public static BigDecimal berechneDichte(BigDecimal volumen, BigDecimal fallbeschleunigung,
			BigDecimal auftriebskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Volumen = {} , Fallbeschleunigung = {} und Auftriebskraft = {}",
					volumen.toPlainString(), fallbeschleunigung.toPlainString(), auftriebskraft.toPlainString());
		BigDecimal result = auftriebskraft.divide((volumen.multiply(fallbeschleunigung)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m?", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung des Volumens
	 * 
	 * @param dichte
	 *            kg/m?
	 * @param fallbeschleunigung
	 *            m/s?
	 * @param auftriebskraft
	 *            N
	 * @return volumen m?
	 */
	public static BigDecimal berechneVolumen(BigDecimal dichte, BigDecimal fallbeschleunigung,
			BigDecimal auftriebskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Auftriebskraft = {} , Fallbeschleunigung = {} und Dichte = {}",
					auftriebskraft.toPlainString(), fallbeschleunigung.toPlainString(), dichte.toPlainString());
		BigDecimal result = auftriebskraft.divide((fallbeschleunigung.multiply(dichte)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m?", result.toPlainString());
		return result;
	}
}
