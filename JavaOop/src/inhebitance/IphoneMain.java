package inhebitance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/*
		 [콘솔 출력문]
		 아이폰을 사용해서 
		 폰을 가지고 다닐 수 있음....
		 홍길동에게 데이터를 전달
		 * */
		//아이폰이 출력되게 하려면 클래스변수(스태틱 변수)는 클래스이름.BRAND 로 가져오면 됩니다.
		//iphone.setCompany(Iphone.BRAND)
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);
		//클래스명.필드명 ...get/set없이 사용하는 이유는 은닉화가 필요없는 고정된 값이기 때문에 Iphone.BRAND 식으로 사용해야 한다.
		iphone.setCompany(Iphone.BRAND+"을 사용해서");
		iphone.setPortable(Iphone.TRUE);//public static으로 준값은 get/set없이 (Iphone.TRUE)처럼 가저다가 쓸수있다.
		System.out.println("전화받는 사람 입력");
		String name = scanner.next();
		iphone.setCall(name);
		System.out.println("메세지 입력");
		iphone.setData(name, scanner.next());//기준에 자동생성된 set을 파라미터가 2개인 메소드로 변경 
		System.out.println(iphone.getCompany());
		System.out.println(iphone.getMove());
		System.out.println(iphone.getCall());
		System.out.println(iphone.getData());
	}
}
