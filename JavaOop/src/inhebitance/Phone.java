package inhebitance;

public class Phone {//눈으로 식별가능한 구상클래스(필드가 있는건 무조건 구상클래스다.없으면 추상클래스로 가자 )
	/*===필드===*/
	private String company;
	private String call;
	
	
	
	/*===생성자===*/
	
	
	
	/*===멤버 메소드 ===*/
	//get set 단축키 : art shift s
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
	
	
}
