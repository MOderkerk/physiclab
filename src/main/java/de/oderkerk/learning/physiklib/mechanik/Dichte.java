/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dichteberechnungen
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Dichte {

	private static Logger logger = LoggerFactory.getLogger(Dichte.class);

	private Dichte() {

	}

	/**
	 * Berechne die Dichte anhand Masse und Volumen
	 * 
	 * @param masse
	 *            in kg
	 * @param volumen
	 *            m³
	 * @return Dichte in kg/m³
	 */
	public static BigDecimal berechneDichte(BigDecimal masse, BigDecimal volumen) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Masse = {} und Volumen = {}", masse.toPlainString(),
					volumen.toPlainString());
		BigDecimal result = masse.divide(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m³", result.toPlainString());
		return result;
	}

	/**
	 * Berechne die Masse anhand Dichte und Volumen
	 * 
	 * @param volumen
	 *            in m³
	 * @param dichte
	 *            in kg/m³
	 * @return masse in kg
	 */
	public static BigDecimal berechneMasse(BigDecimal volumen, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Masse mit Dichte = {} und Volumen = {}", dichte.toPlainString(),
					volumen.toPlainString());
		BigDecimal result = dichte.multiply(volumen);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} in kg", result.toPlainString());
		return result;
	}

	/**
	 * Berechne das Volumen anhand von Masse und Dichte
	 * 
	 * @param masse
	 * @param dichte
	 * @return
	 */
	public static BigDecimal berechneVolumen(BigDecimal masse, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Dichte = {} und Masse = {}", masse.toPlainString(),
					dichte.toPlainString());
		BigDecimal result = masse.divide(dichte);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} in m³", result.toPlainString());
		return result;
	}

}
