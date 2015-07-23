package bank;

import java.util.Iterator;
import java.util.Scanner;

public class KBbank {
	public static void main(String[] args) {
		BankRole bank = new Bank(100);
		//인터페이스를 구현한 클래스 객체를 만들때는 인터페이스타입 인스턴스 = new 생성자();
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객님 성함 ");
		String name = scanner.next();
		System.out.println("고객님 비밀번호 4자리 입력 ");
		int password = scanner.nextInt();
		System.out.println("얼마를 입금 하시겠습니까?");
		int money = scanner.nextInt();		
		bank.openAccount(name, password, money);
		System.out.println("===계좌번호 조회(계좌번호)----");
		System.out.println("검색하려는 고객명 ?");
		String searchName = scanner.next();
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByName(searchName);
		for (BankBook bankBook : searchArr) {
			 bankBook.showAccount();
			
		}
		System.out.println("검색하려는 계좌번호 ?");
		
		bank.searchAccountByAccountNo(scanner.next()).showAccount();
		
		
	}
}
