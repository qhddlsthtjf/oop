package encapsulation;

public class CardGame {
	private String winner;
	
	//생성자 단축키 ctrl + space
	public CardGame() {}//디폴트 생성자 

	public CardGame(CardBean bean1, CardBean bean2) {
		//제일 먼저 리턴타입을 카피 
		String winner = "";
	 	if (bean1.getNum1()>bean2.getNum1()) {
	 		winner = bean1.getName1() + "승리";
	 		
		}else if(bean2.getNum1()>bean1.getNum1()){
			winner = bean2.getName1() + "승리";
			
		}else{
			winner = "비김";
		}
	 	this.winner = winner;
	}
	public String getWinner() {
		return winner;
	}
}
