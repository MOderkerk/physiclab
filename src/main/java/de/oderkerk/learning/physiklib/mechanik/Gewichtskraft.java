/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

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

	/**
	 * Berechne Gewichtskraft über Masse und Fallgeschwindigkeit
	 * 
	 * @param masse
	 *            in kg
	 * @param fallbeschleunigung
	 *            in m/s
	 * @return Gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraft(BigDecimal masse, BigDecimal fallbeschleunigung) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Masse = {} in kg , Fallbeschleunigung = {} in m/s²",
					masse.toPlainString(), fallbeschleunigung.toPlainString());
		BigDecimal result = masse.multiply(fallbeschleunigung);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;

	}

	/**
	 * Berechnung der Masse über Gewichtskraft und Fallgeschwindigkeit
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param fallbeschleunigung
	 *            in m/s
	 * @return Masse in kg
	 */
	public static BigDecimal berechneMasse(BigDecimal gewichtskraft, BigDecimal fallbeschleunigung) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Masse mit Gewichtskraft = {} in N , Fallbeschleunigung = {} in m/s²",
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
	 * @return fallbeschleunigung in m/s²
	 */
	public static BigDecimal berechneFallbeschleunigung(BigDecimal gewichtskraft, BigDecimal masse) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Fallbeschleunigung mit Gewichtskraft = {} in N , Masse = {} in kg",
					gewichtskraft.toPlainString(), masse.toPlainString());
		BigDecimal result = gewichtskraft.divide(masse);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m/s²", result);
		return result;

	}
}
