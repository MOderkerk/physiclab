/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Kräfte
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class Kraefte {

	private static Logger logger = LoggerFactory.getLogger(Kraefte.class);

	private Kraefte() {

	}

	/**
	 * Berechne die resultierende Kraft FR=F1+F2+...Fn
	 * 
	 * @param kraefte
	 *            Liste mit Einzelkräften
	 * @return Resultierende Kraft BigDecimal
	 */
	public static BigDecimal berechneResultierendeKraft(List<BigDecimal> kraefte) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Resultierende Kraft mit den einzelnen Kräften {}", kraefte);
		BigDecimal resultierendeKraft = BigDecimal.valueOf(0);
		for (BigDecimal kraft : kraefte) {
			resultierendeKraft = resultierendeKraft.add(kraft);
		}
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {}", resultierendeKraft.toPlainString() + " N");
		return resultierendeKraft;

	}

}
