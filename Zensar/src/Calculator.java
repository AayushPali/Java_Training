
public class Calculator {
	int a, b;

	Calculator() {

	}

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	static int factorial(int n) {
		int fact = 1;

		while (n != 1) {
			fact = fact * n;
			--n;

		}

		return fact;
	}

	void add() {
		System.out.println("Sum is :" + (a + b));
	}

	int multiply() {
		return a * b;

	}

	float division(float a, float b) {

		return (a / b);
	}

	public static void main(String[] args) {

		int fact = Calculator.factorial(10);
		System.out.println("Factorial is :" + fact);

		Calculator C = new Calculator(10, 5);
		C.add();

		int multiply = C.multiply();
		System.out.println("Multiplication is: " + multiply);

		float div = C.division(10.5f, 5.0f);
		System.out.println("Division is : " + div);

	}

}
