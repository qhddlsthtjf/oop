package bank;

public class Bank implements BankRole{
	//필드
	
	//생성자
	public Bank() {
		
	}
	//멤버메소드

	@Override //계좌계설
	public void openAccount(String accountNo, String OwnerName, String password, int restMoney) {
		
	}
	
	@Override //계좌검색(계좌번호) -> 리턴결과 : 계좌 1개
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}
	
	@Override //계좌검색(이름) -> 리털결과 : 계좌 여러개
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}
	 
	@Override //계좌검색(이름) -> 리턴결과 : 숫자
	public int searchCountByName(String name) {
		int count = 0;
		return count;
	}
	
	@Override //계좌해지 -> 리턴결과 : true or false
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
