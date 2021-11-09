package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;	
		
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����(1)");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker()ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice()ȣ��");
		this.price = price;
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV ��ü ����(2)");
		this.speaker = speaker;
	}	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV ��ü ����(3)");
		this.speaker = speaker;
		this.price = price;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV ===> ���� ����(���� : " + price + "��)");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV ===> ���� ����");
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






