package encapsulation;

public class PayBean {
	//메소드는 선언부, 연산부, 출력부 이렇게 나누고 
	//Bean 클래스라면 멤버필드 +멤버메소드 
	private String name; //멤버필드 변수는 초기화 하지 않는다..!!
	private int salary;
	
	
	//멤버 메소드 영역이 시작됩니다. 
	//setter는 스캐너로 받는놈 생성해줘야함
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//getter 계산해서 toString 으로 뿌려줘야 하는놈은 getter생성해준다.
	public int getTax() {
		int tax = 0;//지변은 초기화 
		tax = (int) (salary * 0.1);
		
		return tax;
	}
	public int getMoney() {
		int money =0;//지변 초기화
		money = salary - this.getTax();//파란색글씨는 멤버필드이다 .여기서 salary - tax를 하면 위에 getter에서 연산한 tax값이 오지않는다 (멤버필드 널값이들어옴)
		return money;					//this.getter 는 이클래스 내부에 있는 ~~의미
	}
	
	
	
	@Override
	public String toString() {
		
		
		return "["+this.name+"]"+"실급여]\n"+"월급 :"+this.salary+"만원\n"+"세금 :"+this.getTax()+"만원\n"+"실급여:"+this.getMoney()+"만원";
	}
	
}
