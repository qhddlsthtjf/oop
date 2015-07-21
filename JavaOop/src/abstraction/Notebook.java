package abstraction;

public class Notebook extends ProductSpec{
	private String cpu;//cpu 사양
	private String ram;//메모리 사양
	private String hdd;//하드디스크 사양
	
	
	public void writeInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		// TODO Auto-generated method stub
		super.writeInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		
	}
	
	@Override
	public void showInfo() {		
		super.showInfo();
		System.out.println("cpu 사양:" + cpu);
		System.out.println("ram" + ram);
		System.out.println("hdd" + hdd);
	}
}
