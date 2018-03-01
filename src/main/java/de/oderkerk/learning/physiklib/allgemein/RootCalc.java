/**
 * 
 */
package de.oderkerk.learning.physiklib.allgemein;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Berechnung von Wurzeln bei BigDecimal Zahlen
 * 
 * @author Odin
 * @since 28.02.2018
 *
 */
public class RootCalc {

	private static Logger logger = LoggerFactory.getLogger(RootCalc.class);

	/**
	 * max Stellen rechts vom Komma
	 */
	private static final int maxScale = 30;

	private RootCalc() {
	}

	/**
	 * Berechnung von Wurzeln für BigDecimal
	 * 
	 * @param zahl
	 *            bei der die Wurzel gezogen werden soll
	 * @param xteWurzel
	 *            int größer gleich 2 (2 = Quadratwurzel,...)
	 * @return wurzelwert
	 */
	public static BigDecimal root(BigDecimal zahl, int xteWurzel) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne {}te Wurzel aus {} mit von Genauigkeit von max. {} Nachkommastellen", xteWurzel,
					zahl, maxScale);
		BigDecimal r = new BigDecimal(0);
		BigDecimal i = new BigDecimal(1);
		for (int x = 0; x < maxScale;) {
			r = r.add(i);
			if (r.pow(xteWurzel).compareTo(zahl) == 1) {
				r = r.subtract(i);
				i = i.divide(BigDecimal.TEN);
				++x;
				continue;
			}
			if (r.pow(xteWurzel).compareTo(zahl) == 0)
				break;
		}
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {}", r.toPlainString());
		return r;
	}
}
