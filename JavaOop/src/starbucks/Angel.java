package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AngelCoffee kim = new AngelCoffee();
		//System.out.println("설탕을 추가합니까? 1 or 2");
		//kim.prepare(scanner.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("레몬티와 자몽티 어떤거?1.레몬 2.자몽");
		lee.prepare(scanner.nextInt());
	}
}
