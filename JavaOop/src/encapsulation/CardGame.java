package encapsulation;
/*
 버전업 
 현재는 홍길동 승 이라고 나오는데 
 개선을 해달랍니다.
 홍길동 : 6
 김유신 : 4
 홍길동 승리 
 * */
public class CardGame {
	/*==========field=========private (인스턴스변수 선언된 곳)*/
	private String winner,looser;
	private int winScore, looseScore;
/*===========Constructor(생성자 영역)============*/	
	//생성자 단축키 ctrl + space
	public CardGame() {}//디폴트 생성자 

	public CardGame(CardBean bean1, CardBean bean2) {
	
		
		//제일 먼저 리턴타입을 카피 
		String winner = ""; //지역변수(로컬)변수는 메모리 영영중에서 (콜)스택에 저장
							//인스턴스변수는 메모리 영역 중에서 힙에 저장
		String looser = "";
		
	 	if (bean1.getNum1()>bean2.getNum1()) {
	 		winner = bean1.getName1() ;
	 		looser = bean2.getName1() ;
	 		this.winScore = bean1.getNum1(); //지역변수 선언안하고 바로 넣는경우  this.을 붙여주자
	 		this.looseScore = bean2.getNum1();
		}else if(bean2.getNum1()>bean1.getNum1()){
			winner = bean2.getName1() ;
			looser = bean1.getName1() ;
			this.winScore = bean2.getNum1();
	 		this.looseScore = bean1.getNum1();
		}else{
			winner = "비김";
		}
	 	this.winner = winner;  this.looser = looser ; //위에 this. 으로 시작한거는 바로 인스턴스 변수에 저장되므로 리턴값 안해도댄다.
	}
	/*
	public String getWinner() {
		return winner;
	}
	public int getWinScore() {
		return winScore;
	}
	public String getLooser() {
		return looser;
	}
	public int getLooseScore() {
		return looseScore;
	}*/
	/*===========멤버 매소드 영역=========*/
	@Override
	public String toString() {
		
		return winner+ "\t" +winScore+ "\n" +looser+ "\t" +looseScore+ "\n" +winner + " 승리" ;
	}
}
