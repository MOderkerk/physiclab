
package de.oderkerk.learning.physiklib.allgemein;

/*-
 * #%L
 * physicslib
 * %%
 * Copyright (C) 2018 Marco Oderkerk
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */





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
	 * Berechnung von Wurzeln f?r BigDecimal
	 * 
	 * @param zahl
	 *            bei der die Wurzel gezogen werden soll
	 * @param xteWurzel
	 *            int gr??er gleich 2 (2 = Quadratwurzel,...)
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
