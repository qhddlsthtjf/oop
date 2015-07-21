package abstraction;

public class Banana implements FruitInterface {

	@Override
	public void display(String str) {
		System.out.println(str + "바나나입니다.");
		
	}

}
