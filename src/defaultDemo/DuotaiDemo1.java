package defaultDemo;

/**
 * 实现接口多态应用
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月23日下午2:18:04
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
		System.out.println("主板已运行...");
	}
	//接口型应用指向自己的子类对象
	public void usepic(PCI p) {
		if(p!=null) {
		p.open();
		p.close();
		}
	}

}
//PCI接口
interface PCI{
	public void open();
	public void close();
}
//网卡
class Netcard implements PCI{

	@Override
	public void open() {
		System.out.println("网卡已开启！");
		
	}

	@Override
	public void close() {
		System.out.println("网卡已关闭！");
	}	
}
//声卡
class Soundcard implements PCI{

	@Override
	public void open() {
		System.out.println("声卡已开启！");		
	}

	@Override
	public void close() {
		System.out.println("声卡已关闭！");		
	}
	
}