package week1;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		
		int balance = 0;
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		balance += money;
		
		System.out.println("You inserted " + money + "KZT! Your current balance is " + balance);
		
	}

}
