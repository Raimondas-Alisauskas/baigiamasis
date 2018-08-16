
public class AdresoPaieska {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressService service = new AddressService();
		
		
		Buhalteris p = new Buhalteris();
		
		
		String address = service.getAddress(p);
		
		address = service.getAddress('5', "");
		
		

	}

}
