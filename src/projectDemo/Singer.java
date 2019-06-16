package projectDemo;
/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年5月14日下午3:58:36
 */
public class Singer extends Actor {

	public Singer() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Singer(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void performs() {
		System.out.println("歌唱演员"+getName()+"正在表演歌唱节目（大家一起喜羊羊）");
	}

}
