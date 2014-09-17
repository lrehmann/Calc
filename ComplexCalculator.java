package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	public void subtract(double d){
		currentNumber = currentNumber - d;
	}
		
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
		
	public void divide(double d){
		currentNumber = currentNumber / d;	
	}
		
	public void clear(){
		currentNumber = 0;
	}
		
	public void power(double d){
		double c=currentNumber;
		while (d>1){
			currentNumber = currentNumber * c;
			d=d-1;
		}
	}
		
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}
