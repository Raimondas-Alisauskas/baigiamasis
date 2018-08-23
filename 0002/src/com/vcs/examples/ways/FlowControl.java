package com.vcs.examples.ways;

/**
 * @author Paulius Z. <Paulius@zubavicius.lt>
 *
 */
public class FlowControl {

	/**
	 * 
	 * Padavus validzia data, turetu grazinti:
	 * 
	 * 2018, 08, 01, 12, 15, 10 => Du tukstanciai astuoniolikti metai, rugpjucio
	 * pirma. Dvylika val. ....
	 * 
	 * 
	 * FuzzyTime on: Siu metu, rupjucio pati pradzia siektiek po vidurdienio
	 * 
	 * 
	 * @param metai
	 * @param menuo
	 * @param diena
	 * @param hh
	 * @param mm
	 * @param ss
	 * @return
	 */
	public String getDateTimeHumanReadable(int metai, int menuo, int diena, int hh, int mm, int ss, boolean fuzzyTime) {

		return "";
	}

	private FastestWay fw = new FastestWay();

	/**
	 * Kas nors funkcija kur kviecia bileKa funkcija ir grazina... niekas nezino ka
	 * <p>
	 * :D public FastestWay kasNors(String param) { ... kita funkcija() }
	 * </p>
	 * 
	 * <pre>
	 * public FastestWay kasNors(String param) {
	 * 
	 * </pre>
	 * 
	 * {@link www.delfi.lt}
	 * 
	 * @see FastestWay
	 * 
	 * @param param
	 *            - string'as kuris jau yra pravaliduotas ir paruostas apdorojimui
	 * @return veiklos obj pagal parametra
	 */
	public FastestWay kasNors(String param) {

		// Vis del to reik cia validacijos, #45645
		if (fw.validacija(param)) {

			/*
			 * UpRight[26] is an open source library for constructing services that tolerate
			 * both crashes ("up") and Byzantine behaviors ("right") that incorporates many
			 * of these protocols' innovations.
			 * 
			 * In addition to PBFT and UpRight, there is the BFT-SMaRt library,[27] a
			 * high-performance Byzantine fault-tolerant state machine replication library
			 * developed in Java. This library implements a protocol very similar to PBFT's,
			 * plus complementary protocols which offer state transfer and on-the-fly
			 * reconfiguration of hosts. BFT-SMaRt is the most recent effort to implement
			 * state machine replication, still being actively maintained.
			 */

			param += " trecias";
			fw.show(param);
		} else {
			return null;
		}

		return fw;
	}

}
