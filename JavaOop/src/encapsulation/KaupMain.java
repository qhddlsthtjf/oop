package encapsulation;

import java.util.Scanner;

/*
 *  @ Date : 2015.07.14
 *  @ Author : me
 *  @ Story : 메인
 * */
public class KaupMain {
	public static void main(String[] args) {
		//선언부
				Scanner scanner = new Scanner(System.in);
				String name ="", msg = "" ; 
				double height = 0.0d, weight = 0.0d;
				int idx = 0; //카우푸 인덱스
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				System.out.println("키를 입력하세요");
				height = scanner.nextDouble();
				System.out.println("몸무게를 입력하세요");
				weight = scanner.nextDouble();
		//2015. 07. 14 키 몸무게 입력받아 카우푸지수 구하기
		KaupBean4 kaupbean = new KaupBean4();
		kaupbean.setName(name);
		kaupbean.setHeight(height);
		kaupbean.setWeight(weight);
		kaupbean.getIndex();
		
		// 출력부
		System.out.println(kaupbean.toString());
	}
}
