package bank;


public class Bank implements BankRole{
	//필드
	//은행은 통장을 여러개를 관리한다.
	//따라서 필드에 인스턴스변수 하나를 지정하지 않고 여러개를 담을 수 있는 배열을 지정한다.
	//여렇개를 담을 수 있는 배열을 지정한다.
	//아래 배열은 은행에서 보면 계좌를 관리하는 DB
	
	
	private BankBook[] bankBookList;
	private int count;//은행에서 관리하는 통장 갯수 
	//생성자
	//배열 ,자료구조(컬렉션) 을 보유하는 객체를 만들고자 할 때는 그 객체의
	//생성자에 배열,자료구조의 객체를 생성해준다.
	public Bank(int count) {
		bankBookList = new BankBook[count];
	}
	//멤버메소드
	public BankBook[] getBankBookList() {
		return bankBookList;
	}
	public int getCount() {
		return count;
	}
	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}
	public void setCount(int count) {
		this.count = count;
	}
	/*
	 계좌번호, 계좌주, 비번, 잔액 만 입력하면 통장을 만들어 준다.
	 * */
	@Override //계좌계설
	public void openAccount(String ownerName, int password, int restMoney) {
	
				
		BankBook bankBook = new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		//통장을 개설하자마자 은행 전산 DB에 통장정보 저장 
		bankBookList[count] = (BankBook) bankBook;
		this.count++; //전체 은행에 개설된 통장 갯수 1증가
		System.out.println(bankBook.showAccount());
	}
	
	@Override //계좌검색(계좌번호) -> 리턴결과 : 계좌 1개
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;
		//String 타입을 int 타입으로 바꿀필요가 생겻다 아래 방법으로 한다.
		int searchAccountNO = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) { 
			/*
			 문자타입(String) 서로 같은지 여부. equals()
			 숫자타입(int) 서로 같은지 여부 ==
			 * */
			if (bankBookList[i].getBankbookNo()==searchAccountNO) {
				account = bankBookList[i];
			}
		}
		return account;
	}
	
	
	@Override //계좌검색(이름) -> 리털결과 : 계좌 여러개
	public BankBook[] searchAccountByName(String ownerName) {
		BankBook[] accounts = null;
		//searchAccountByName() 이 메서드를 호출하면 자동으로 searchCountByName()을 먼저 호출하라 
		int tempcount = this.searchCountByName(ownerName);
		if (tempcount==0) {
			return null;
		}
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[count] = bankBookList[i];
				count++;
			}
		}
		return accounts;
	}
	 
	@Override //계좌검색(이름) -> 리턴결과 : 숫자
	public int searchCountByName(String name) {
		/*
		 for 문을 돌면서 파라미터로 받은 이름과 동일한 통장(계좌)가 있다면 count 를 0에서 1씩 증가시켜라
		 * */
		int count = 0;
		for (int i = 0; i < bankBookList.length; i++) {//bankBookList.length<<는 this.count 랑 같다 
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}
	
	@Override //계좌해지 -> 리턴결과 : true or false
	public boolean closeAccount(String accountNo) {
		//flag 은 삭제가 성공적으로 이루어 지면 true 를 리턴하고 삭제할게 없으면 false 리턴 
		boolean flag = false;
		//String(문자열) 로 들어온 값을 숫자로 바꿔서 비교 
		int searchAccountNO = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo()==searchAccountNO) {
				flag = true;
				/*
				 j=i로 바꾼이유는 홍길동의 계좌가 은행 전체 계좌의 50번째 라면 내부 for문에서 다시 처음0부터 회전하지않고 
				 홍길동의 계좌가 있는 인덱스 번호부터 뒤에 있는 계좌번호를 덮어 쓰는 방식으로 진행한후 맨 마지막 인덱스번호를 제거하면
				 은행에서 전체 계좌가 있는 100개가 있는상황이라면 홍길동이 삭제된 후 전체 계좌수는 99개가 될것이다. 그래서 this.count-1을 해줬음.
				 * */
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
					
				}
				count--;
			}
		}
	
		return flag;
	}
	

}
