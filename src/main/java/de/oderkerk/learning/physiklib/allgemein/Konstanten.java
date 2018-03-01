
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

/**
 * Klasse mit physikalischen Konstanten
 * 
 * @author Marco Oderkerk
 * @since 25.02.2018
 *
 */
public class Konstanten {

	/**
	 * Kreiszahl Pi = 3.14159265358979323846 F?r normale Berechnungen reicht diese
	 * Genauigkeit normalerweise aus.
	 */
	public final static BigDecimal KREISZAHL = BigDecimal.valueOf(3.14159265358979323846);

	/**
	 * Eulersche Zahl e = 2.71828182845904523536d
	 */
	public final static BigDecimal EULERSCHE_ZAHL = BigDecimal.valueOf(2.71828182845904523536);

	/**
	 * Elektronenladung e = 1.60217733 * 10^-19 C
	 */
	public final static BigDecimal ELEKTRONENLADUNG = BigDecimal.valueOf(1.60217733)
			.multiply(BigDecimal.valueOf(Math.pow(10, -19)));

	/**
	 * Gravitationskonstante G,k = 6.67259 * 10^-11 m?g^-1s^-2
	 */
	public final static BigDecimal GRAVITATIONS_KONSTANTE = BigDecimal.valueOf(6.67259d)
			.multiply(BigDecimal.valueOf(Math.pow(10, -11)));
	/**
	 * Lichtgeschwindigkeit c = 2.99792458 * 10^8 m/s
	 */
	public final static BigDecimal LICHTGESCHWINDIGKEIT = BigDecimal.valueOf(2.99792458)
			.multiply(BigDecimal.valueOf(Math.pow(10, 8)));

	/**
	 * Dielektrizit?tskonstante e0 = 8.854187 * 10^-12 F/m
	 */
	public final static BigDecimal DIELEKTRIZITAETS_KONSTANTE = BigDecimal.valueOf(8.854187)
			.multiply(BigDecimal.valueOf(Math.pow(10, -12)));

	/**
	 * Permeabilitaetskonstante u0 (4*piE)^-1 in H/m
	 */
	public final static BigDecimal PERMEABILITAETSKONSTANTE = BigDecimal.valueOf(5).multiply(KREISZAHL)
			.multiply(BigDecimal.valueOf(Math.pow(10, -7)));

	/**
	 * Planksches Wirkungsquantum h 6.6260755 * 10^-34 Js
	 */
	public final static BigDecimal PLANKSCHES_WIRKUNGSQUANTUM = BigDecimal.valueOf(6.6260755)
			.multiply(BigDecimal.valueOf(Math.pow(10, -34)));

	/**
	 * Molare Gaskonstante R = 8.31441 J*mol^-1*K^-1
	 */
	public final static BigDecimal MOLARE_GASKONSTANTE = BigDecimal.valueOf(8.31441);

	/**
	 * Avogadro-Konstante Na = 6.0221367 * 10^23 mol^-1
	 */
	public final static BigDecimal AVOGADRO_KONSTANTE = BigDecimal.valueOf(6.0221367)
			.multiply(BigDecimal.valueOf(Math.pow(10, 23)));

	/**
	 * Boltzmann-Konstante K=R/NA 1.380658 * 10^-23 J/K
	 */
	public final static BigDecimal BOLTZMANN_KONSTANTE = BigDecimal.valueOf(1.380658)
			.multiply(BigDecimal.valueOf(Math.pow(10, -23)));

	/**
	 * Ruhemasse des Elektron Me 9.1093897 * 10^-31 in kg
	 */
	public final static BigDecimal RUHEMASSE_DES_ELEKTRONS = BigDecimal.valueOf(9.1093897)
			.multiply(BigDecimal.valueOf(Math.pow(10, -31)));
	/**
	 * Ruhemasse des Protons Mp 1.6726231 * 10^-27 in kg
	 */
	public final static BigDecimal RUHEMASSE_DES_PROTONS = BigDecimal.valueOf(1.6726231)
			.multiply(BigDecimal.valueOf(Math.pow(10, -27)));

	/**
	 * Ruhemasse des Neutrons Mn 1.6749547 * 10^-27 in kg
	 */
	public final static BigDecimal RUHEMASSE_DES_NEUTRONS = BigDecimal.valueOf(1.674954)
			.multiply(BigDecimal.valueOf(Math.pow(10, -27)));

	/**
	 * Ruhemasse des Alpha Teilchens Mn 6.6447 * 10^-27 in kg
	 */
	public final static BigDecimal RUHEMASSE_DES_ALPHATEILCHENS = BigDecimal.valueOf(6.6447)
			.multiply(BigDecimal.valueOf(Math.pow(10, -27)));

	/**
	 * Atomare Masseneinheit Mu=1/12m(12/6C) 1.6605656 * 10^-27 in kg
	 */
	public final static BigDecimal ATOMARE_MASSENEINHEIT = BigDecimal.valueOf(1.6605656)
			.multiply(BigDecimal.valueOf(Math.pow(10, -27)));

	/**
	 * Masse der Sonne Mo1.989 * 10^30 in kg
	 */
	public final static BigDecimal MASSE_DER_SONNE = BigDecimal.valueOf(1.989)
			.multiply(BigDecimal.valueOf(Math.pow(10, 30)));

	/**
	 * Radius der Erde Ra =6.378 * 10^6 in m
	 */
	public final static BigDecimal RADIUS_DER_ERDE = BigDecimal.valueOf(6.378)
			.multiply(BigDecimal.valueOf(Math.pow(10, 6)));

	/**
	 * Masse der Erde MA 5.976 * 10^24 in kg
	 */
	public final static BigDecimal MASSE_DER_ERDE = BigDecimal.valueOf(5.976)
			.multiply(BigDecimal.valueOf(Math.pow(10, 24)));

	/**
	 * Umlaufdauer der Erde um die Sonne = 365.24219879 Tage
	 */
	public final static BigDecimal UMLAUFDAUER_ERDE_SONNE = BigDecimal.valueOf(365.24219879);

	/**
	 * Astronomische Einheit AU = 1.4959787066 * 10^11 m
	 */
	public final static BigDecimal ASTRONOMISCHE_EINHEIT = BigDecimal.valueOf(1.4959787066)
			.multiply(BigDecimal.valueOf(Math.pow(10, 11)));

	/**
	 * Lichtjahr lj= 9.4605 * 10^15 m
	 */
	public final static BigDecimal LICHTJAHR = BigDecimal.valueOf(9.4605)
			.multiply(BigDecimal.valueOf(Math.pow(10, 15)));

	/**
	 * Parsec pc =3.0857 * 10^16 m
	 */
	public final static BigDecimal PARSEC = BigDecimal.valueOf(3.0857).multiply(BigDecimal.valueOf(Math.pow(10, 16)));

}
