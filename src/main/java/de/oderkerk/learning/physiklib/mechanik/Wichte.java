/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

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
	 *            in m³
	 * @return wichte in N/m³
	 */
	public static BigDecimal berechneWichte(BigDecimal gewichtskraft, BigDecimal volumen) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Wichte mit Gewichtskraft = {} und Volumen = {}", gewichtskraft.toPlainString(),
					volumen.toPlainString());

		BigDecimal result = gewichtskraft.divide(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N/m³", result);
		return result;

	}

	/**
	 * Berechnung des Volumens mit Wichte und Gewichtskraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param wichte
	 *            in N/m³
	 * @return volumen in m³
	 */
	public static BigDecimal berechneVolumen(BigDecimal gewichtskraft, BigDecimal wichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Gewichtskraft = {} und Wichte = {}", gewichtskraft.toPlainString(),
					wichte.toPlainString());

		BigDecimal result = gewichtskraft.divide(wichte);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m³", result);
		return result;

	}

	/**
	 * Berechnung der Geichtskraft mit Volumen und Wichte
	 * 
	 * @param volumen
	 *            m³
	 * @param wichte
	 *            N/m³
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
