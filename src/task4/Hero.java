package task4;
/**
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��5��12������5:43:07
 * 	����ʹ�ü̳�
 */
public class Hero {
	private String nickname;
	private int level;
	private int maxLife;
	private int currLife;
	public void move() {
		System.out.println("Hero���move����");
	}
	
	public Hero() {
		super();//���ø���
		// TODO �Զ����ɵĹ��캯�����
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
