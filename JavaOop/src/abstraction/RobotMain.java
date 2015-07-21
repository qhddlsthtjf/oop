package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력 
		 건로봇은 속도는 10, 에너지는 10  공격력 은 50
		 -공격력은 인스턴스 변수로 int attackPoint
		 
		 쉴드로봇은 속도는 20, 에너지는 20  방어력은 50
		 -방어력은 인스턴스 변수로 int shieldPoint 
		 * */
		Attack attack = new Attack();
		attack.charge(10);
		attack.run(10);
		attack.attack(50);
		Shield shield = new Shield();
		shield.charge(20);
		shield.run(20);
		shield.shield(50);
		
		Robot[] cart = new Robot[2]; 
		
		cart[0] = attack;
		cart[1] = shield;
		
		for (Robot robot :cart) {
			robot.status();
			
		}
	}
}
