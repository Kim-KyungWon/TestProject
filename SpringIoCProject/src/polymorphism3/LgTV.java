package polymorphism3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV {

	@Autowired
	private Speaker speaker; // @���ҽ��� �������� �ƴ� jdk�� �����ϴ� Annotation �̴� - JDK �� ������ ����
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
