
public final class CalculatorApi {

	
	private double result = 0;
	
	
	public CalculatorApi plus(double sk) {
		this.result = this.result + sk;
		return this;
	}
	
	public CalculatorApi plus(Integer sk) {
		if (sk != null) {
			//TODO
		}
		return this;
	}
	
	public CalculatorApi plus(Character sk) {
		//TODO
		return this;
	}
	
	public CalculatorApi magicOperator(double sk) {
		
		//TODO
		return this;
	}
	
	// plus()
	// minus()
	// sqrt()
	// divide()
	// multiply()
	// magicOperator()
	
	
	public double getResult() {
		return result;
	}
	
	// 4 + 6 + 8.0
	// 
	
}
