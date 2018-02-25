/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Berechnungen für den Schweredruck
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Schweredruck {
	private static Logger logger = LoggerFactory.getLogger(Schweredruck.class);

	/**
	 * Berchnung des Schweredruck
	 * 
	 * @param dichte
	 *            kg/m³
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param hoehe
	 *            m
	 * @return schweredruck pa
	 */
	public static BigDecimal berechneSchweredruck(BigDecimal dichte, BigDecimal fallbeschleunigung, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Schweredruck mit Dichte = {} ,Fallbeschleunigung {} und Höhe = {}",
					dichte.toPlainString(), fallbeschleunigung.toPlainString(), hoehe.toPlainString());
		BigDecimal result = dichte.multiply(fallbeschleunigung).multiply(hoehe);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} Pa", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Dichte
	 * 
	 * @param schweredruck
	 *            pa
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param hoehe
	 *            m
	 * @return dichte kg/m³
	 */
	public static BigDecimal berechneDichte(BigDecimal schweredruck, BigDecimal fallbeschleunigung, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Schweredruck = {} ,Fallbeschleunigung {} und Höhe = {}",
					schweredruck.toPlainString(), fallbeschleunigung.toPlainString(), hoehe.toPlainString());
		BigDecimal result = schweredruck.divide((fallbeschleunigung.multiply(hoehe)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m³", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Höhe
	 * 
	 * @param schweredruck
	 *            pa
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param dichte
	 *            kg/m³
	 * @return hoehe m
	 */
	public static BigDecimal berechneHoehe(BigDecimal schweredruck, BigDecimal fallbeschleunigung, BigDecimal dichte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Schweredruck = {} ,Fallbeschleunigung {} und Dichte = {}",
					schweredruck.toPlainString(), fallbeschleunigung.toPlainString(), dichte.toPlainString());
		BigDecimal result = schweredruck.divide((fallbeschleunigung.multiply(dichte)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}
}
