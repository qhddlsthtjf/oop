package encapsulation;

import java.util.Scanner;

public class CardMain {
	public static void main(String[] args) {
		//선언부 ==> 집에 있는 유저가 자기 모니터 입력 
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("플레이어1 이름 입력");		
		CardBean hong = new CardBean(scanner.next());
		System.out.println("플레이어2 이름 입력");		
		CardBean kim = new CardBean(scanner.next());
		//인터넷 망을 타고 데이터값이 게임회사 들어옴
		
		
		CardGame game = new CardGame(hong,kim);
		//사용자가 결과화면을 보는중...
		System.out.println(game.toString());
	}
}
