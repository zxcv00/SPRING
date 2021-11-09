package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV ===> Àü¿ø ÄÑÁü");
	}
	public void powerOff() {
		System.out.println("LgTV ===> Àü¿ø ²¨Áü");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}

}






