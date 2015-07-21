package abstraction;

public class Apple implements FruitInterface{
	/*===필드===*/
	/*===생성자===*/
	/*===멤버 메소드===*/
	@Override
	public void display(String str) {
		System.out.println(str + "사과입니다.");
		
	}
}
