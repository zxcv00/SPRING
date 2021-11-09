package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;	
		
	public SamsungTV() {
		System.out.println("===> SamsungTV 按眉 积己(1)");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker()龋免");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice()龋免");
		this.price = price;
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV 按眉 积己(2)");
		this.speaker = speaker;
	}	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV 按眉 积己(3)");
		this.speaker = speaker;
		this.price = price;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV ===> 傈盔 难咙(啊拜 : " + price + "盔)");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV ===> 傈盔 波咙");
	}	
	@Override
	public void volumeUp() {
		speaker.volumeUp();	
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}






