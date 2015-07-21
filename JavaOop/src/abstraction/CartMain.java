package abstraction;

public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.writeInfo("삼성", "와이드TV", "123-456", "42인치", "LED");
		Notebook lgNotebook = new Notebook();
		lgNotebook.writeInfo("엘지", "그램", "569-456", "듀얼코어", "8G", "500GB");
		
		/*
		 * 생성자를 사용하지 않는 인터페이스라도 타입으로 사용하기 위해 배열을 선언하는 것은 가능하다.
		 * */
		Product[] cart = new Product[2];
		// 인터페이스를 사용하는 이유 2
		// 타입으로 통합을 해야하는 클래스들의 집합이 필요한 상황에서 각각의 클래스를
		// 하나의 컬렉션에 담는 역할을 한다.
		cart[0] = samsungTV;
		cart[1] = lgNotebook;
		//배열을 출락할 때는 forloop 인데
		//카트 내부에 있는 객체를 선언해야 할 
		//필요가 존재합니다.
		//for(int=0; i <cart.lenth; i++){
		//}
		
		//이 상황에서는 확장된 for문이 있는데 그걸사용합니다 
		//for(인터페이스타입 이스턴스 : 배열명){}
		
		for (Product product :cart) {
			product.showInfo();
			
		}
		
	}
}
