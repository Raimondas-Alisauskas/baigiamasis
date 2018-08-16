
public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorApi calc = new CalculatorApi();

		Integer i = 23;

		// double result =
		calc.plus(i);
		calc.magicOperator(6767f);
		
		
		
		System.out.println(calc.getResult());
		//---------------------------------------------
		calc = new CalculatorApi();
		
		System.out.println(calc.plus(i).plus('A').plus(45).magicOperator(34535).getResult());

	}

}
