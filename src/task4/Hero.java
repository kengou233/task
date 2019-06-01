package task4;
/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年5月12日下午5:43:07
 * 	初步使用继承
 */
public class Hero {
	private String nickname;
	private int level;
	private int maxLife;
	private int currLife;
	public void move() {
		System.out.println("Hero类的move方法");
	}
	
	public Hero() {
		super();//调用父类
		// TODO 自动生成的构造函数存根
	}
	public Hero(String nickname, int level, int maxLife, int currLife) {
		super();
		this.nickname = nickname;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}

}
