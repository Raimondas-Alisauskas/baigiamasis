
public class PassingValuesToMethods {
	
	int id = 45;
	
	public void metodasKvietimui() {
		
		Person p = new Person();
		p.setId(45);
		
		
		Person p1 = new Person();
		p1.setId(4);
		
		Person p2; // null
		
		p2 = p1;
		
		p1 = p;
		
		p.setId(6);
		
		p1.setId(10);
		
		p1 = null;
		
//		metodas1(id, p);
		
		p1 = p2;
		
//		System.out.println(id);
		System.out.println(p1.getId());
		
	}
	
	
	@SuppressWarnings("unused")
	private void metodas1(int id, Person p) {
		
		this.id = 60;
		
		int id2 = p.getId();
		id2 = 55;
		
		p.setId(44);
		
	}
	

}
