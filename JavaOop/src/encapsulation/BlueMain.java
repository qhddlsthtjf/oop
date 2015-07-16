package encapsulation;

public class BlueMain {
	public static void main(String[] args) {
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Blue blue = new Blue(dice1,dice2);
		
		System.out.println(blue.toString());
	}

}
