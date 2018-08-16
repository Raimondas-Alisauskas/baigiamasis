package com.vcs.examples.mvn.parser;

import org.apache.commons.lang3.NotImplementedException;

import com.vcs.examples.mvn.tests.NameUniqService;
import com.vcs.examples.mvn.tests.NevalidusVardas;

public class NameErrorHandler {

	public String getTikVardas(String param) {

		NameParser f1 = new NameParser(new NameUniqService() {
			
			public String createUniq(String nameNotUniq) {
				throw new RuntimeException("Name is already uniq");
			}
			
			public boolean checkUniq(String string) {
				return true;
			}
		});
//		try {
			try {
				
				//f1.validate(param);
				
				return f1.parseUniqName(param);
			} catch (NevalidusVardas e) {
				throw new RuntimeException(e); 
			} finally {
				
				System.out.println("Ar mene isspausdins kai bus klaida?");
				
			}
			
			
		//} catch (NevalidusVardas e) {
//
//			if (KlaidosTipas.ISPEJIMAS.equals(e.getTipas())) {
//				System.out.println("Turetum nenaudoti skaiciu ar simboliu varde, bet ...");
//				return e.getVardas();
//			} else {
//				return "Anzelmas";
//			}
			
//			return "Anzelmas";
			
		}
	

}
