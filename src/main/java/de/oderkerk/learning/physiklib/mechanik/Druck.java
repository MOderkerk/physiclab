/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Brechnungen zum Druck
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Druck {
	private static Logger logger = LoggerFactory.getLogger(Druck.class);

	/**
	 * Berechnung des Drucks
	 * 
	 * @param flaeche
	 *            in m²
	 * @param kraft
	 *            in N
	 * @return druck in Pa
	 */
	public static BigDecimal berechneDruck(BigDecimal flaeche, BigDecimal kraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Druck mit Fläche = {} und Kraft = {}", flaeche.toPlainString(),
					kraft.toPlainString());
		BigDecimal result = kraft.divide(flaeche);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} Pa", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Fläche
	 * 
	 * @param druck
	 *            in Pa
	 * @param kraft
	 *            in N
	 * @return flaeche in m²
	 */
	public static BigDecimal berechneFlaeche(BigDecimal druck, BigDecimal kraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Fläche mit Druck = {} und Kraft = {}", druck.toPlainString(), kraft.toPlainString());
		BigDecimal result = kraft.divide(druck);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m²", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Kraft
	 * 
	 * @param druck
	 *            in Pa
	 * @param flaeche
	 *            in m²
	 * @return fraft in N
	 */
	public static BigDecimal berechneKraft(BigDecimal druck, BigDecimal flaeche) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Kraft mit Druck = {} und Fläche = {}", druck.toPlainString(),
					flaeche.toPlainString());
		BigDecimal result = druck.multiply(flaeche);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result.toPlainString());
		return result;
	}
}
