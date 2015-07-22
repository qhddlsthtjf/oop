package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스명 인스턴스 = new 생성자();
		 * */
		Recipe cf = new Cofee();
		
		
		cf.boilWater();
		cf.brew();
		cf.pourInCup();
		System.out.println("설탕을 추가합니까? 1 or 2");
		cf.select(scanner.nextInt());
		cf.serve();
		
		Tea tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("레몬티와 자몽티 어떤거?1.레몬 2.자몽");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
