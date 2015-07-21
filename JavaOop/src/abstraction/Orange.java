package abstraction;

public class Orange implements FruitInterface {

	@Override
	public void display(String str) {
		System.out.println(str + "오렌지입니다.");
		
	}
	public int count(){//int 리턴 타입  class타입이면 class acc =null; null값을넣어주면된다
		//리턴 타입이 void 가 아니라면 
		//반드시 return 키워드를 사용해야 한다.
		//리턴 타입이 존재할 때 코딩하는 방법 
		//1.리턴 타입의 지변을 초기화 한다.
		int count = 100;
		//2.return 키워드 뒤에 지변을 둔다.
		return count;
	}

}
