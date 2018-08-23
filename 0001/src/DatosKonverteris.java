public class DatosKonverteris {

	public String convert(int menuo, int diena) {

		//Menesis[] menesiai = Menesis.values();
		
		//Menesis@345
		
		// [Sausio, Vasario, Kovo, Balandžio, Gegužės, Birželio, Liepos, Rugpjūčio, Rugsėjo, Spalio, Lapkričio, Gruodžio] + ... d.
		//return Arrays.toString(menesiai) + " " + diena + " d.";
		
		
		return Menesis.values()[menuo -1] + " " + diena + " d."; 

	}
	
	public String convert(String menuo, String diena) {
		return Menesis.values()[Integer.valueOf(menuo) -1] + " " + diena + " d."; 
	}

}
