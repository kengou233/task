package task5;
/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年5月14日下午3:55:18
 */
public class Actor {
	public String getName() {
		return name;
	}
	
	public Actor(String name) {
		super();
		this.name = name;
	}

	public Actor() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public void performs() {
		System.out.println("演员"+name+"正在表演精彩的节目");
	}
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
}
