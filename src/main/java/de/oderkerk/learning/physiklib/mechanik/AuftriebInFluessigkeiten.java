/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Odin
 * @since 25.02.2018
 *
 */
public class AuftriebInFluessigkeiten {
	private static Logger logger = LoggerFactory.getLogger(AuftriebInFluessigkeiten.class);

	/**
	 * Berechnung der AUftriebskraft
	 * 
	 * @param volumen
	 *            im m³
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param dichte
	 *            kg/m³
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
	 *            m³
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param auftriebskraft
	 *            N
	 * @return kg/m³
	 */
	public static BigDecimal berechneDichte(BigDecimal volumen, BigDecimal fallbeschleunigung,
			BigDecimal auftriebskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Dichte mit Volumen = {} , Fallbeschleunigung = {} und Auftriebskraft = {}",
					volumen.toPlainString(), fallbeschleunigung.toPlainString(), auftriebskraft.toPlainString());
		BigDecimal result = auftriebskraft.divide((volumen.multiply(fallbeschleunigung)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} kg/m³", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung des Volumens
	 * 
	 * @param dichte
	 *            kg/m³
	 * @param fallbeschleunigung
	 *            m/s²
	 * @param auftriebskraft
	 *            N
	 * @return volumen m³
	 */
	public static BigDecimal berechneVolumen(BigDecimal dichte, BigDecimal fallbeschleunigung,
			BigDecimal auftriebskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Volumen mit Auftriebskraft = {} , Fallbeschleunigung = {} und Dichte = {}",
					auftriebskraft.toPlainString(), fallbeschleunigung.toPlainString(), dichte.toPlainString());
		BigDecimal result = auftriebskraft.divide((fallbeschleunigung.multiply(dichte)));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m³", result.toPlainString());
		return result;
	}
}
