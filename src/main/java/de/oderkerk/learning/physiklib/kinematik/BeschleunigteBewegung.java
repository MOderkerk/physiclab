/**
 * 
 */
package de.oderkerk.learning.physiklib.kinematik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.oderkerk.learning.physiklib.allgemein.RootCalc;

/**
 * Berechnung der Beschleunigten Bewegung
 * 
 * @author Odin
 * @since 27.02.2018
 *
 */
public class BeschleunigteBewegung {
	private static Logger logger = LoggerFactory.getLogger(BeschleunigteBewegung.class);

	/**
	 * Berechnung des Wegs ohne Anfangsbeschwindigkeit
	 * 
	 * @param zeit
	 *            in s
	 * @param beschleunigung
	 *            m/s²
	 * @return weg m
	 */
	public static BigDecimal berechneWegOhneAnfangsgeschwindigkeit(BigDecimal zeit, BigDecimal beschleunigung) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Weg  mit Zeit = {} und Beschleunigung = {} , ", zeit.toPlainString(),
					beschleunigung.toPlainString());
		BigDecimal result = BigDecimal.valueOf(0.5).multiply(beschleunigung).multiply(zeit.pow(2));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Beschleunigung ohne Anfangsbeschwindigkeit
	 * 
	 * @param zeit
	 *            in s
	 * @param weg
	 *            in m
	 * @return beschleunigung m/s²
	 */
	public static BigDecimal berechneBeschleunigungOhneAnfangsgeschwindigkeit(BigDecimal zeit, BigDecimal weg) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Weg  mit Zeit = {} und Weg = {} , ", zeit.toPlainString(), weg.toPlainString());
		BigDecimal result = (BigDecimal.valueOf(2).multiply(weg)).divide(zeit.pow(2));
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m/s²", result.toPlainString());
		return result;
	}

	/**
	 * Berechnung der Zeit ohne Anfangsgeschwindigkeit.
	 * 
	 * @param beschleunigung
	 *            in m/s²
	 * @param weg
	 *            in m
	 * @return Zeit in s
	 */
	public static BigDecimal berechneZeitOhneAnfangsgeschwindigkeit(BigDecimal beschleunigung, BigDecimal weg) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Weg  mit Beschleunigung = {} und Weg = {} , ", beschleunigung.toPlainString(),
					weg.toPlainString());
		BigDecimal result = RootCalc.root(weg.multiply(BigDecimal.valueOf(0)).divide(beschleunigung), 2);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m/s²", result.toPlainString());
		return result;
	}
}
