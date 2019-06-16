package projectDemo;

public class Dancer extends Actor {

	public Dancer() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Dancer(String name) {
		super(name);
	}
	public void performs() {
		System.out.println("舞蹈演员"+getName()+"正在展示她婀娜多姿的舞蹈");
	}
	
}
