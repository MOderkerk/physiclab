/**
 * 
 */
package de.oderkerk.learning.physiklib.kinematik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
