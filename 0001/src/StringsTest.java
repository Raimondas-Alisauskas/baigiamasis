
public class StringsTest {
	
	
	
	
	
	private static String text;
	
	@SuppressWarnings("unused")
	public static void main(String ... args){
		text = null;
		text = "";
		text = "asdsad";
		text = new String();
		
		text = "asasdsad " + "asdasd";
		text += "pridedam dar " + false;
		
		System.out.println( text.length()); // ilgis
		
		text = "Pirmas zodis gerai";
		System.out.println(text.substring(0, 1)); // Iskirpimas
		
		System.out.println(text.replaceAll("a", "x"));
		
		System.out.println(text.charAt(3)); // as a char
		
		text.concat("asdasda"); // Warn!!!!
		String str = text.concat("asdasda");
		
		text.indexOf(" "); // grazins pirma ieskoma simboli (6)
		text.endsWith(".docx"); // grazina boolean
		text.startsWith("Pi"); // grazins TRUE
		
		text.isEmpty(); // grazina BOOLEAN
		
		String [] listOfWords = text.split(" ");
		
		
		
		
		
	}
	
	
	
	
	

}
