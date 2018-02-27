/**
 * 
 */
package de.oderkerk.learning.physiklib.kinematik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Formeln zur Berechnung von Gradlinigen Bewegungen v=konstant
 * 
 * @author Odin
 * @since 27.02.2018
 *
 */
public class GeradlinigeBewegung {
	private static Logger logger = LoggerFactory.getLogger(GeradlinigeBewegung.class);

	private GeradlinigeBewegung() {
	}

	/**
	 * Berechnung der zurückgelegten Distanz / Weg
	 * 
	 * @param zeit
	 *            s
	 * @param geschwindigkeit
	 *            m/s
	 * @return weg m
	 */
	public static BigDecimal berechneWeg(BigDecimal zeit, BigDecimal geschwindigkeit) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Weg  mit Zeit = {} und Gescwindigkeit = {}", zeit.toPlainString(),
					geschwindigkeit.toPlainString());
		BigDecimal result = geschwindigkeit.multiply(zeit);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Zeit
	 * 
	 * @param weg
	 *            in m
	 * @param geschwindigkeit
	 *            in m/s
	 * @return zeit s
	 */
	public static BigDecimal berechneZeit(BigDecimal weg, BigDecimal geschwindigkeit) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Zeit  mit Weg = {} und Geschwindigkeit = {}", weg.toPlainString(),
					geschwindigkeit.toPlainString());
		BigDecimal result = weg.divide(geschwindigkeit);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} s", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Geschwindigkeit
	 * 
	 * @param weg
	 *            m
	 * @param zeit
	 *            s
	 * @return egschwindigkeit m/s
	 */
	public static BigDecimal berechneGeschwindigkeit(BigDecimal weg, BigDecimal zeit) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Geschwindigkeit  mit Weg = {} und Zeit = {}", weg.toPlainString(),
					zeit.toPlainString());
		BigDecimal result = weg.divide(zeit);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m/s", result.toPlainString());
		return result;
	}

}
