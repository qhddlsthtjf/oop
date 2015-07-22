package starbucks;

public class Tea extends Cofee{
	/*
	 커피 끓이는 순서 
	1. 물을 끓인다.
	2. 티백을 내린다.
	3. 물을 컵에 붓는다.
	4. 레몬,자몽 첨가 여부를 손님에게 묻는다
	   -레몬 : 레몬티 , 자몽 : 자몽티
	5. 홍차를 제공한다.
	   - 고객님  레몬티가 커피가 나왔습니다.
	 * */
	private String op;
	
	
	@Override
	public void brew() {
		System.out.println("티백을 내린다.");
	}
	
	@Override
	public void select(int option) {
		switch (option) {
		case 1: op ="레몬"; break;
		case 2: op ="자몽"; break;
		
		
		default: op = "다시입력하세요";
			break;
		}
	}
	@Override
	public void serve() {
		System.out.println("고객님 "+ this.op +"티가 나왔습니다.");
	}
	
}
