public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double sum, subtract, multiplication, division, power;
		sum = first + second;
		subtract = first - second;
		multiplication = first * second;
		division = first / second;
		power = Math.pow(first, second);
		System.out.println("Sum = "+sum);
		System.out.println("Subtract = "+subtract);
		System.out.println("Multiplication = "+multiplication);
		System.out.println("Division = "+division);
		System.out.println("Power = "+power);
	}
}
