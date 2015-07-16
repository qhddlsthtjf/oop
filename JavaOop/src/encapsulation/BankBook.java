package encapsulation;
/*
 객체지향 프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야 한다.
통장을 이루는 요소를 생각해 봅시다.
그 요소가 결국 인스턴스 변수를 구성하게 됩니다.
1.은행이름 =>아이티뱅크 bank
2.통장번호 =>5자리에 랜덤숫자 bankbookNo
3.소유자 명 =>생성자에 스캐너로 입력받는 값  name
4.날짜/예금/출금/잔액  =>돈 =>스캐너로 입력받는 값 숫자타입 int money
5.비밀번호 => 스캐너로 입력받는 값 int 4자리  pass
 
 [출력]
=========== 
 [아이티 뱅크]
 계좌 번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
===========  
 * */
public class BankBook {
	private String bank, name;
	private int bankbookNo, money, pass;
	
	
	public BankBook() {
		// TODO Auto-generated constructor stub
	}
	public BankBook(String name) {
		this.name = name;
	}
	public BankBook(int num) {
		
	}
	
	
	
	
	
	public void setBank(String bank) {
		this.bank = "아이티 뱅크";
	}
	public String getBank() {
		return bank;
	}
	
	
	
 @Override
public String toString() {
		return "===========\n"+ 
				 "["+bank +"]\n"
						+ "계좌 번호 :" + bankbookNo
						+ "이름 :" + name
						+ "잔액 :" + money +"원"
						+"===========" ;
}
 
}
