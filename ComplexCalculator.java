//Calculator by Luke Rehmann
package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber += d;
	}
	
	public void subtract(double d){
		currentNumber-= d;
	}
		
	public void multiply(double d){
		currentNumber *= d;
	}
		
	public void divide(double d){
		currentNumber/= d;	
	}
		
	public void clear(double d){
		currentNumber = 0;
	}
		
	public void power(double d){
		double c=currentNumber;
		if (d==0){
			currentNumber=1;
		}else if(d<0){
			while (d<0){
				currentNumber /= c;
				d=d+1;
			}
		}else{
			while (d>0){
				currentNumber *= c;
				d=d-1;
			}
		}

	}
		
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	public boolean isEven(double d){
		return !(d%2);
	}
	
	public boolean isPrime(double d){
		double c=d;
		while (c>1){
			if (d%c==0){ return 0; }
			c=c-1;
		}
		if (d>1){
			return 1;
		}else{
			return 0;
		}
	}
	
}
