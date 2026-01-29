package week1;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int D = b * b - 4 * a * c;
		
		if(D < 0) {
			System.out.println("Error");
		} else System.out.println(D);
		
	}

}
