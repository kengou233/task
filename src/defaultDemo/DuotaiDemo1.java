package defaultDemo;

/**
 * ʵ�ֽӿڶ�̬Ӧ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��23������2:18:04
 */
public class DuotaiDemo1 {
	public static void main(String[] args) {
		Mainboard m = new Mainboard();
		m.run();
		m.usepic(null);
		m.usepic(new Netcard());
		m.usepic(new Soundcard());
	}
}

class Mainboard{
	public void run() {
		System.out.println("����������...");
	}
	//�ӿ���Ӧ��ָ���Լ����������
	public void usepic(PCI p) {
		if(p!=null) {
		p.open();
		p.close();
		}
	}

}
//PCI�ӿ�
interface PCI{
	public void open();
	public void close();
}
//����
class Netcard implements PCI{

	@Override
	public void open() {
		System.out.println("�����ѿ�����");
		
	}

	@Override
	public void close() {
		System.out.println("�����ѹرգ�");
	}	
}
//����
class Soundcard implements PCI{

	@Override
	public void open() {
		System.out.println("�����ѿ�����");		
	}

	@Override
	public void close() {
		System.out.println("�����ѹرգ�");		
	}
	
}