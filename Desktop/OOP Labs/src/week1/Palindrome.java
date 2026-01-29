package week1;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
	
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String t = sb.toString();
		
		if(s.equals(t)) {
			System.out.println("Yes!");
		} else System.out.println("No");
		
		
	}

	
}
