package abstraction;

public class BasicBot implements Robot{
	private int energy;
	private int speed;
	
	@Override
	public void status() {
		System.out.print(" 로봇 속도:" + this.speed+ " 로봇 에너지 :" + this.energy);
		
	}

	@Override
	public void charge(int energy) {
		
		this.energy += energy;
	}

	@Override
	public void run(int speed) {
		
		this.speed += speed;
	}

}


