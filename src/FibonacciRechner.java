import java.util.Scanner;

public class FibonacciRechner {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie eine Zahl ein: ");
		int n = sc.nextInt();
		System.out.print(FibonacciCalc(n));
		sc.close();
	}
	private static int FibonacciCalc(int n) {
		if (n <= 0) 
			return 0;
		else if (n == 1)
			return 1;
		else 
			return FibonacciCalc (n-1) + FibonacciCalc (n-2);	
	}
}
