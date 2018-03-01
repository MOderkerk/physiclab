
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
 * Berechnungen zur schiefen Ebenen
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class SchiefeEbene {
	private static Logger logger = LoggerFactory.getLogger(SchiefeEbene.class);

	/**
	 * Berechnung der Hangabtriebskraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @param laenge
	 *            in m
	 * @return hangabtriebskraft in N
	 */
	public static BigDecimal berechneHangabtriebskraft(BigDecimal gewichtskraft, BigDecimal hoehe, BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Hangabtriebskraft mit Gewichtskraft = {} H?he = {} und L?nge = {}",
					gewichtskraft.toPlainString(), hoehe.toPlainString(), laenge.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(hoehe)).divide(laenge);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Gewichtskraft ?ber die Hangabtriebskraft
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @param laenge
	 *            in m
	 * @return gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraftUeberHangabtriebskraft(BigDecimal hangabtriebskraft, BigDecimal hoehe,
			BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Hangabtriebskraft = {} ,H?he = {} und L?nge = {}",
					hangabtriebskraft.toPlainString(), hoehe.toPlainString(), laenge.toPlainString());
		BigDecimal result = (hangabtriebskraft.multiply(laenge)).divide(hoehe);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der H?he
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param gewichtskraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @return hoehe in m
	 */
	public static BigDecimal berechneHoehe(BigDecimal hangabtriebskraft, BigDecimal gewichtskraft, BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne H?he mit Hangabtriebskraft = {} Gewichtskraft = {} und L?nge = {}",
					hangabtriebskraft.toPlainString(), gewichtskraft.toPlainString(), laenge.toPlainString());
		BigDecimal result = (hangabtriebskraft.multiply(laenge)).divide(gewichtskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der L?nge
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param gewichtskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @return laenge in m
	 */
	public static BigDecimal berechneLaengeUeberHangabtriebskraft(BigDecimal hangabtriebskraft,
			BigDecimal gewichtskraft, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne H?he mit Hangabtriebskraft = {} Gewichtskraft = {} und Hoehe = {}",
					hangabtriebskraft.toPlainString(), gewichtskraft.toPlainString(), hoehe.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(hoehe)).divide(hangabtriebskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der Normalkraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param breite
	 *            in m
	 * @return normalkraft in N
	 */
	public static BigDecimal berechneNormalkraft(BigDecimal gewichtskraft, BigDecimal laenge, BigDecimal breite) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Normalkraft mit Gewichtskraft = {} ,L?nge = {} und Breite = {}",
					gewichtskraft.toPlainString(), laenge.toPlainString(), breite.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(breite)).divide(laenge);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Gewichtskraft ?ber Normalkraft
	 * 
	 * @param normalkraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param breite
	 *            in m
	 * @return gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraftUeberNormalkraft(BigDecimal normalkraft, BigDecimal laenge,
			BigDecimal breite) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Normalkraft = {} ,L?nge = {} und Breite = {}",
					normalkraft.toPlainString(), laenge.toPlainString(), breite.toPlainString());
		BigDecimal result = (normalkraft.multiply(laenge)).divide(breite);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Breite
	 * 
	 * @param normalkraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param gewichtskraft
	 *            in N
	 * @return breite in m
	 */
	public static BigDecimal berechneBreite(BigDecimal normalkraft, BigDecimal laenge, BigDecimal gewichtskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Breite mit Normalkraft = {} ,L?nge = {} und Gewichtskraft = {}",
					normalkraft.toPlainString(), laenge.toPlainString(), gewichtskraft.toPlainString());
		BigDecimal result = (normalkraft.multiply(laenge)).divide(gewichtskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der L?nge ?ner die Normalkraft
	 * 
	 * @param normalkraft
	 *            in N
	 * @param breite
	 *            in m
	 * @param gewichtskraft
	 *            in N
	 * @return laenge in m
	 */
	public static BigDecimal berechneLaengeUeberNormalkraft(BigDecimal normalkraft, BigDecimal breite,
			BigDecimal gewichtskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Breite mit Normalkraft = {} ,Breite = {} und Gewichtskraft = {}",
					normalkraft.toPlainString(), breite.toPlainString(), gewichtskraft.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(breite)).divide(normalkraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}
}
