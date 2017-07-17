import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.print("Enter first arg: ");
				String first = sc.next();
				System.out.print("Enter second arg: ");
				String second = sc.next();
				System.out.println("1 - sum");
				System.out.println("2 - subtract");
				System.out.println("3 - multiply");
				System.out.println("4 - divide");
				System.out.print("Choose an operation: ");
				int choose = Integer.valueOf(sc.next());
				switch (choose) {
					case 1: {
						calc.add(Double.valueOf(first), Double.valueOf(second));
						System.out.println("Result: "+calc.getResult());
						break;
					}
					case 2: {
						calc.subtract(Double.valueOf(first), Double.valueOf(second));
						System.out.println("Result: "+calc.getResult());
						break;
					}
					case 3: {
						calc.multiply(Double.valueOf(first), Double.valueOf(second));
						System.out.println("Result: "+calc.getResult());
						break;
					}
					case 4: {
						calc.divide(Double.valueOf(first), Double.valueOf(second));
						System.out.println("Result: "+calc.getResult());
						break;
					}
					default: System.out.println("Invalid operation!"); 
						break;
				}
				System.out.print("Clean? (yes/no)");
				if (sc.next().equals("yes"))
					calc.cleanResult();
				System.out.print("Exit? (yes/no)");
				exit = sc.next();
			}
		} finally {
			sc.close();
		}
	}
}