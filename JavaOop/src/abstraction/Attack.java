package abstraction;

public class Attack extends BasicBot {
	private int attackPoint;
	
	@Override
	public void status() {
		System.out.print("건로봇은 ");
		super.status();
		System.out.println(" 공격력은 :" +attackPoint);
	}
	
	@Override
	public void charge(int energy) {
		
		super.charge(energy);
	}
	@Override
	public void run(int speed) {
		
		super.run(speed);
	}
	public void attack(int attack){//setter 로 사용해도 된다.
		
		this.attackPoint = attack;
	}

}
