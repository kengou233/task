package task4;
/**
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��5��14������2:04:07
 */
public class Master extends Hero {
	private int MagicAttack;
	public Master() {
		setNickname("Ĭ�Ϸ�ʦ");
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
	}
	public Master (String name) {
		this();//�����Լ�
		setNickname(name);
	}
	
	public int getMagicAttack() {
		return MagicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		MagicAttack = magicAttack;
	}

	public void shockWave(){
		System.out.println("��ʦ"+getNickname()+"�����˳����������");
	}
}
