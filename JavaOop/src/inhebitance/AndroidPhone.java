package inhebitance;
/*
 객체지향언어 (2) 상속의 문법
 -부모에게 선언된 필드 , 메소드를 그대로 사용하기 위해서는 
  자식 클래스에는 별도로 추가하지 않는다 .=> 순수 상속 
-오버라이딩 문법
	부모에게 선언된 필드,메소드를 그대로 사용하지 않고 
	약간의 변형을 시킨 후 재사용 하는 문법
===> 이런식으로 상속을 하되 다양하게 변화를 시키는 패턴을 객체지향언어(4)다양성 이라고 합니다.
===> 다양성은 상속 뿐 아니라 추상화에서도 나타납니다.더불어 생성자 문법에서도 나타납니다.
 * */
public class AndroidPhone extends Iphone{
	public static String BRAND = "안드로이드 폰";
	private String os ;
	private String data;
	
	@Override 
	public String getOs() {
		// super.getOs();
		return os;
	}
	@Override
	public void setOs(String os) {
		this.os = "android";
	}
	@Override //오버라이드 는 부모에 있는거말고 지금 여기쓰는걸 최우선적으로 쓰겟다.라는 의미 
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.isPortable();
		super.setCall(name);
		//super.setData(name, data);
		this.data = super.getCompany() + "\t" +
					super.getCall()+"\t" +
					this.getOs()+"\t" +
					data +"카톡 메시지 전달";
				
	
	
	}
	@Override
	public String getData() {
		
		return data;
	}
}
