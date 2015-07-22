package starbucks;

public class AngelCoffee extends DrinkRecipe {
	private String coffee;
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
		
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1: this.coffee ="밀크커피"; break;
		case 2: this.coffee ="블랙커피"; break;
		
		
		default: this.coffee = "다시입력하세요";
			break;
		}
	}

	@Override
	void serve() {
		System.out.println("고객님 " + this.coffee + " 가 나왔습니다" );
		
	}

}
