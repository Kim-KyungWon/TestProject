package polymorphism3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV {

	@Autowired
	private Speaker speaker; // @리소스는 스프링이 아닌 jdk가 제공하는 Annotation 이다 - JDK 에 영향을 받음
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
