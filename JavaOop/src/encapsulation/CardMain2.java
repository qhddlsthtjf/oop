package encapsulation;

import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 [오더]
		 카드 두장을 비교해서 카드 번호가 더 큰 수가 이기는 게임 프로그램을 작성하시오 
		 일단,프로토타입(시제품) 프로그램으로 
		 개발자가 임의의 숫자를 입력하면 
		 [출력]
		 [홍길동 : 7] vs [김유신 : 3]
		 홍길동 승리
		 * */
		
		Scanner scanner = new Scanner(System.in);
		String name1 = "",name2 = ""; 
		int num1 = 0 ,num2 = 0;
		
		System.out.println("플레이어1 이름 입력");
		name1 = scanner.next();
		
		System.out.println("플레이어2 이름 입력");
		name2 = scanner.next();
		
		
		CardBean3 cardBean = new CardBean3();// <<--new 뒤에 CardBean()  <<객체를 생성하는 생성자다
		//스캐너가 받아 놓은 값은 현재 지변에 있다.
		// 그런데 연산로직은 객체이 있다.따라서 지변에 있는 값을 멤변에 던저야 한다.
		
		cardBean.setName1(name1);
		cardBean.setNum1();//스캐너로 받지 않는다고 setNum()를 호출(사용)하지 않는다면 랜덤 숫자가 발생하지 않는다.
		cardBean.setName2(name2);
		cardBean.setNum2();
		
		System.out.println(cardBean.toString());
	}
}
