/**
 * 
 */
package de.oderkerk.learning.physiklib.mechanik;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Berechnungen zur schiefen Ebenen
 * 
 * @author Odin
 * @since 25.02.2018
 *
 */
public class SchiefeEbene {
	private static Logger logger = LoggerFactory.getLogger(SchiefeEbene.class);

	/**
	 * Berechnung der Hangabtriebskraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @param laenge
	 *            in m
	 * @return hangabtriebskraft in N
	 */
	public static BigDecimal berechneHangabtriebskraft(BigDecimal gewichtskraft, BigDecimal hoehe, BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Hangabtriebskraft mit Gewichtskraft = {} Höhe = {} und Länge = {}",
					gewichtskraft.toPlainString(), hoehe.toPlainString(), laenge.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(hoehe)).divide(laenge);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Gewichtskraft über die Hangabtriebskraft
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @param laenge
	 *            in m
	 * @return gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraftUeberHangabtriebskraft(BigDecimal hangabtriebskraft, BigDecimal hoehe,
			BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Hangabtriebskraft = {} ,Höhe = {} und Länge = {}",
					hangabtriebskraft.toPlainString(), hoehe.toPlainString(), laenge.toPlainString());
		BigDecimal result = (hangabtriebskraft.multiply(laenge)).divide(hoehe);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Höhe
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param gewichtskraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @return hoehe in m
	 */
	public static BigDecimal berechneHoehe(BigDecimal hangabtriebskraft, BigDecimal gewichtskraft, BigDecimal laenge) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Höhe mit Hangabtriebskraft = {} Gewichtskraft = {} und Länge = {}",
					hangabtriebskraft.toPlainString(), gewichtskraft.toPlainString(), laenge.toPlainString());
		BigDecimal result = (hangabtriebskraft.multiply(laenge)).divide(gewichtskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der Länge
	 * 
	 * @param hangabtriebskraft
	 *            in N
	 * @param gewichtskraft
	 *            in N
	 * @param hoehe
	 *            in m
	 * @return laenge in m
	 */
	public static BigDecimal berechneLaengeUeberHangabtriebskraft(BigDecimal hangabtriebskraft,
			BigDecimal gewichtskraft, BigDecimal hoehe) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Höhe mit Hangabtriebskraft = {} Gewichtskraft = {} und Hoehe = {}",
					hangabtriebskraft.toPlainString(), gewichtskraft.toPlainString(), hoehe.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(hoehe)).divide(hangabtriebskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der Normalkraft
	 * 
	 * @param gewichtskraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param breite
	 *            in m
	 * @return normalkraft in N
	 */
	public static BigDecimal berechneNormalkraft(BigDecimal gewichtskraft, BigDecimal laenge, BigDecimal breite) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Normalkraft mit Gewichtskraft = {} ,Länge = {} und Breite = {}",
					gewichtskraft.toPlainString(), laenge.toPlainString(), breite.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(breite)).divide(laenge);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Gewichtskraft über Normalkraft
	 * 
	 * @param normalkraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param breite
	 *            in m
	 * @return gewichtskraft in N
	 */
	public static BigDecimal berechneGewichtskraftUeberNormalkraft(BigDecimal normalkraft, BigDecimal laenge,
			BigDecimal breite) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Gewichtskraft mit Normalkraft = {} ,Länge = {} und Breite = {}",
					normalkraft.toPlainString(), laenge.toPlainString(), breite.toPlainString());
		BigDecimal result = (normalkraft.multiply(laenge)).divide(breite);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} N", result);
		return result;
	}

	/**
	 * Berechnung der Breite
	 * 
	 * @param normalkraft
	 *            in N
	 * @param laenge
	 *            in m
	 * @param gewichtskraft
	 *            in N
	 * @return breite in m
	 */
	public static BigDecimal berechneBreite(BigDecimal normalkraft, BigDecimal laenge, BigDecimal gewichtskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Breite mit Normalkraft = {} ,Länge = {} und Gewichtskraft = {}",
					normalkraft.toPlainString(), laenge.toPlainString(), gewichtskraft.toPlainString());
		BigDecimal result = (normalkraft.multiply(laenge)).divide(gewichtskraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}

	/**
	 * Berechnung der Länge üner die Normalkraft
	 * 
	 * @param normalkraft
	 *            in N
	 * @param breite
	 *            in m
	 * @param gewichtskraft
	 *            in N
	 * @return laenge in m
	 */
	public static BigDecimal berechneLaengeUeberNormalkraft(BigDecimal normalkraft, BigDecimal breite,
			BigDecimal gewichtskraft) {
		if (logger.isDebugEnabled())
			logger.debug("Berechne Breite mit Normalkraft = {} ,Breite = {} und Gewichtskraft = {}",
					normalkraft.toPlainString(), breite.toPlainString(), gewichtskraft.toPlainString());
		BigDecimal result = (gewichtskraft.multiply(breite)).divide(normalkraft);
		if (logger.isDebugEnabled())
			logger.debug("Ergebnis = {} m", result);
		return result;
	}
}
