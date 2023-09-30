package programs;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		System.out.println("Before swapping:");
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		// Swapping without a temporary variable
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping:");
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		}
		}