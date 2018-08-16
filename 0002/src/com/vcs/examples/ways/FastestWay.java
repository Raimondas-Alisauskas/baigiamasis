package com.vcs.examples.ways;

public class FastestWay {
	
	public boolean validacija(String param) {		
		return param != null && !param.isEmpty();
	}
	
	
	public void show(String param) {
		if (param.length() > 3) {
			return;
		}
		
		System.out.println(param);
	}

//	private static final String TR = "tr";
//	
//
//	public static void main(String[] args) {
//		
//		
//		/*
//		 * 
//		 * if (...) ... 
//		if (...) ... else ...
//		if (...) {...}
//		if (...) {...} else ...
//		if (...) {...} else if (...) {...} else {...}
//		(... ? ... : ...)
//		 * 
//		 * 
//		 * */
//		
//		int savDiena = args.length;
//
//		if (savDiena == 1) {
//			System.out.println("Pirmadienis");
//		} else if (savDiena == 2) {
//			System.out.println("Antradienis");
//		} else if (savDiena == 7) {
//			System.out.println("Sekmadienis");
//		} else {
//			System.out.println("Nezinoma diena:" + savDiena);
//		}
//		
//		
//		String arSavaigalis = "Deje bet ne :(";
//		if (savDiena > 5) {
//			arSavaigalis = "Savaitalis!!!";
//		}
//		
//		int reiksme = (savDiena > 5 ? 1  : 0 ) ;
//		
//		System.out.println( (savDiena > 5 ? "Savaitgalis!!!"  : "" ) );
//		
//		
//		
//		/// Switch'ai
//		
//		
//		switch (savDiena) {
//		case 1:
//			System.out.println("Prmadienis");
//		case 2:
//			System.out.println("Antradienis");
//		case 3:
//			System.out.println("TReciadienis");
//		case 4:
//			System.out.println("Ketvirtadienis");
//		case 5:
//			System.out.println("Penktadienis");
//			break;
//		case 6:
//			System.out.println("Sestadienis");
//		case 7:
//			System.out.println("Sekamadinis");
//
//		default:
//			System.out.println("Emm...?!");
//			
//		case 8: //
//		}
//		
//		
//		
//		
//		switch (savDiena) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Darbadienis");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Savaitgalis");
//			break;
//			
//		default:
//			System.out.println("Emm...?!");
//			
//		}
//		
//		String savDienaStr = "tr";
//		
//		
//		
//		switch (savDienaStr) {
//		case "pr": savDiena = 1;
//		case "an": savDiena = 2;
//		case TR: savDiena = 3;
//		case "kt": savDiena = 4;
//		case "pn" : savDiena = 5;
//		case "st" : savDiena = 6;
//		case "sk" : savDiena = 7;
//		default:
//			System.out.println("Emm...?!");
//			
//		}
//		
//
//	}
//	
//	
//	/*public String getWay(boolean p1, boolean p2,boolean p3,boolean p4,boolean p5,boolean p6) {
//		
////		boolean post1;
//		// kodas cia...
//		String result ="";
//		
////		result = 
//		
//		if (p1 && p2) {
//			return "12";
//		}
//		
//		
//		
//		
//		return result;
//	}
//	*/
//	


}
