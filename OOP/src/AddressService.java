import java.util.Random;

public class AddressService {

	// public
	// private

	@Deprecated
	public String getAddress(char id, String ak) {

		Person p = new Person();
		p.setAk(ak);
		p.setId(id);

		return getAddress(p);

	}

	public String getAddress(char id, String ak, String name) {

		Person p = new Person();
		p.setAk(ak);
		p.setId(id);
		p.setVardas(name);
		
		
		double a = 5.0;
		Float b = 5.0f;
		
		return getAddress(b);

	}

	public String getAddress(Person person) {
		
		

		// TODO paieska pagal asmeni
		return "";
	}

	public String getAddress(Buhalteris person) {

		// TODO paieska pagal asmeni
		return "";
	}
	
	public String getAddress(double person) {

		// TODO paieska pagal asmeni
		return "";
	}
	
	public String getAddress(float person) {

		// TODO paieska pagal asmeni
		return "";
	}

	// public String getAddress(int id) {
	//
	// // TODO paieska pagal ID
	// return "";
	// }

	// private String getAddress(char id) {
	//
	// // TODO paieska pagal ID
	// return "";
	// }

	// public void pradinisMetodas() {
	// // Cia kodas
	//
	//// String[] pradDuom = "".split(" ");
	//
	//
	// String result = null;//sujunkStringus(0, "sad");
	//
	// result = sujunkStringus(1, intArrayMetodas());
	//
	//// result = sujunkStringus(2, new String[] {"sad", "sadafds"});
	//
	// // Cia kodas
	//
	//
	// }
	//
	//
	// private int [] intArrayMetodas() {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	//
	// public String sujunkStringus(int sk, int ... param) {
	//
	// String result = "";
	// for (String string : param) {
	// result +=string ;
	// result += " ";
	// }
	//
	// return result;
	// }
	//

}
