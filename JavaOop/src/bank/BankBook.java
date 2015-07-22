package bank;

public class BankBook implements Account{
	/* ==================멤버 필드=================== */
	public static String BANK; // 상수와 스태틱 처리는 대문자로 변수이름을 써준다.
	private String name;
	private int bankbookNo, money, pass; // 컨트롤 시프트 / 하면 다중주석 된다 드래그 한다음에
	private String msg;//유효성체크 결과를 알려줘서 고객이 만약 실수로 그렇게 입력했다면 공지해주는 변수 
	
	
	public BankBook(String name) {
		this.BANK = "아이티 뱅크";
		this.bankbookNo = (int) ((Math.random() * 99999) + 10000);
		this.name = name;
	}
	// 개발자는 setter를 쓸지 생성자로 끝낼지를 고민
	// 값을 바뀔수도 있으면 setter를 사용하자
	// getter setter 단축키 : alt + shift + s

	/* ======== 멤버 메소드 ========= */
	@Override
	public String toString() {
		return "===========\n" + "[" + BANK + "]\n" + "계좌 번호 :" + this.bankbookNo + "이름 :" + this.name + "잔액 :"
				+ this.money + "원" + "===========";
	}

	public String getName() {
		return name;
	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public int getMoney() {
		return money;
	}
	public int getPass() {
		return pass;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	@Override
	public void withdraw(int money) {
		//파라미터 값이 정상값이 아닌 상태를 추정해서 필터링 하는 로직이 필요해짐
		//==>유효성 체크 
		if (money <= 0 ) {
			msg = "출금액은 0보다 커야합니다.";
		} else if(this.money < money){
			msg = "출금액이 잔액보다 큽니다.";
			
		}else{
			this.money -= money; //누적된 값에서 마이너스를 한다는 뜻
		}
		 
	}
	@Override
	public void deposit(int money) {
		if (money <= 0 ) {
			msg = "입금액은 0보다 커야합니다.";
		} else {
			this.money += money;
		}
	}


}
