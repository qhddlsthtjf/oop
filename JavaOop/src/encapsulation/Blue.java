package encapsulation;

public class Blue {
	private int diceSum;
	
	
	
	
	
	
	public Blue(Dice dice1,Dice dice2) {
		
		int diceSum = 0;
		
		diceSum = dice1.getDice()+dice2.getDice();
		
		this.diceSum =diceSum;
	}






	@Override
	public String toString() {
		
		return "두 주사위의 합이"+ this.diceSum +" 이니 "+ this.diceSum + "칸 전진 ";
	}
}
