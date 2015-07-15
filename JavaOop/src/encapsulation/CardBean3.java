package encapsulation;

public class CardBean3 {
	private String name1,name2;
	private int num1,num2;

	
	
	public void setName1(String name1) {//()안에 값을 파라미터라하고 소속은 지변 
		this.name1 = name1;
		//this.name 은 인스턴스변수(멤변)이고
		//= name 은 파라미터로 넘어온 지변이다 
		//스캐너가 받아 놓은 값을 가진 지변 값을 멤변 this.name에 넣어라
		//파라미터값과 멤변값의 이름은 달라도 상관없다.
		//단 데이터 타입( string ,int등)은 반드시 일치해야 한다.
	}
	public String getName1() {
		return name1;
	}
	public void setNum1() {//외부에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.num1 = (int) ((Math.random()*13)+1);//1부터 13까지의 정수 중에서 랜덤 숫자를 리턴 
	}
	public int getNum1() {
		return num1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName2() {
		return name2;
	}
	public void setNum2() {
		this.num2 = (int) ((Math.random()*13)+1);
	}
	public int getNum2() {
		return num2;
	}
	public String getWinner() { //getter 에서 문제해결 패턴 
	 	String winner ="";//제일 먼저 리턴타입을 카피 
		int winnernum = 0;
	 	if (num1>num2) {
	 		winner = name1 + "승리";
	 		winnernum = num1;
		}else if(num2>num1){
			winner = name2 + "승리";
			winnernum = num2;
		}else{
			winner = "비김";
		}
		return winner;
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		return "["+getName1()+":"+ getNum1() +"] vs ["+getName2()+":"+getNum2()+"]\n"+getWinner();
	}
}//[홍길동 : 7]
