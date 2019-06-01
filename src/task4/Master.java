package task4;
/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年5月14日下午2:04:07
 */
public class Master extends Hero {
	private int MagicAttack;
	public Master() {
		setNickname("默认法师");
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
	}
	public Master (String name) {
		this();//调用自己
		setNickname(name);
	}
	
	public int getMagicAttack() {
		return MagicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		MagicAttack = magicAttack;
	}

	public void shockWave(){
		System.out.println("法师"+getNickname()+"发动了冲击波！！！");
	}
}
