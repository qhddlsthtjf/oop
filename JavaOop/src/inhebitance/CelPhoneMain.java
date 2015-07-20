package inhebitance;

import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone nokia = new CelPhone();
		Scanner scanner = new Scanner(System.in);
		/*
		 [콘솔 출력문]
		 노키아 휴대전화를 사용해서 
		 폰을 가지고 다닐 수 있음....
		 홍길동에게 전화를 검
		 * */
		nokia.setCompany("노키아 휴대전화");
		nokia.setPortable(true);//boolean 타입이므로 true 든 false든 넣어줘야 한다.
		//boolean 타입의 set메소드를 이용하여 
		//setMove 를 자동 설정하게끔 유도하고 
		//출력은 isPotable()이 아니라 getMove()를 호출하게 하는 패턴
		System.out.println("전화번호 입력");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCompany());
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
	
	}
}
