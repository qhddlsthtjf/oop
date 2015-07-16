package encapsulation;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		BankBook name = new BankBook(scanner.next());
		System.out.println("입금할 금액을 입력하세요");
		BankBook money = new BankBook(scanner.nextInt());
		System.out.println("비밀번호 입력하세요");
		BankBook pass = new BankBook(scanner.nextInt());
		
	}
}
