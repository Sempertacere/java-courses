public class Calculator {
	private double result;

	public void add(double ... params) {
		for (Double param : params) {
			this.result += param;
		}
	}

	public void subtract(double ... params) {
		for (Double param : params) {
			this.result -= param;
		}
	}
	
	public void multiply(double ... params) {
		for (Double param : params) {
			this.result *= param;
		}
	}

	public void divide(double ... params) {
		for (Double param : params) {
			this.result /= param;
		}
	}

	public double getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}