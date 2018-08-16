package com.vcs.examples.mvn;

import org.apache.commons.lang3.StringUtils;

public class ManoFunkcijos {

	/**
	 * Data pavers String tipo
	 * 
	 * @param menuo
	 * @param diena
	 * @return
	 */
	public String dateConvert(int menuo, int diena, boolean ddFlag) {
		return Menesis.values()[menuo - 1] + " " + diena + (ddFlag ?  " d." : "");
	}

	/**
	 * Data pavers String tipo
	 * 
	 * @param menuo
	 * @param diena
	 * @return
	 */
	public String dateConvert(String menuo, String diena) {
		return Menesis.values()[Integer.valueOf(menuo) - 1] + " " + diena + " d.";
	}
	
	
	public boolean isEmptyString(String str) {
		return StringUtils.isNotBlank(str);
	}

}
