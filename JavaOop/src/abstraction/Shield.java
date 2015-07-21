package abstraction;

public class Shield extends BasicBot {
	private int shieldPoint;
	@Override
	public void charge(int energy) {
		
		super.charge(energy);
	}
	@Override
	public void run(int speed) {
		
		super.run(speed);
	}
	@Override
	public void status() {
		System.out.println("쉴드 로봇은");
		super.status();
		System.out.println("방어력은 :" + shieldPoint);
	}
	
	public void shield(int shield){//setter로 사용해도 된다.
		this.shieldPoint = shield;
	}
	

}
