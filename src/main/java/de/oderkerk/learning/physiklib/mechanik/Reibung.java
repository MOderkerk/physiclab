/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Berechnung der Reibungskraft
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Reibung {
	private static Logger logger = LoggerFactory.getLogger(Reibung.class);

	/**
	 * Berchnung der Reibungszahl
	 * 
	 * @param reibungszahl
	 *            int
	 * @param normalkraft
	 *            in N
	 * @return reibungskraft in N
	 */
	public static BigDecimal berechneReibungskraft(BigDecimal reibungszahl, BigDecimal normalkraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Reibungskraft mit Reibungszahl = {} und Normalkraft = {}",
					reibungszahl.toPlainString(), normalkraft.toPlainString());
		BigDecimal result = reibungszahl.multiply(normalkraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Reibungszahl
	 * 
	 * @param reibungskraft
	 *            in N
	 * @param normalkraft
	 *            in N
	 * @return reibungszahl
	 */
	public static BigDecimal berechneReibungszahl(BigDecimal reibungskraft, BigDecimal normalkraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Reibungszahl mit Reibungskraft = {} und Normalkraft = {}",
					reibungskraft.toPlainString(), normalkraft.toPlainString());
		BigDecimal result = reibungskraft.divide(normalkraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} ", result);
		return result;
	}

	/**
	 * Berechnung der Normalkraft
	 * 
	 * @param reibungskraft
	 *            in N
	 * @param reibungszahl
	 *            int
	 * @return Normalkraft in N
	 */
	public static BigDecimal berechneNormalkraft(BigDecimal reibungskraft, BigDecimal reibungszahl) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Normalkraft mit Reibungskraft = {} und Reibungszahl = {}",
					reibungskraft.toPlainString(), reibungszahl.toPlainString());
		BigDecimal result = reibungskraft.divide(reibungszahl);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} in N", result);
		return result;
	}

}
