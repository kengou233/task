package task4;

public class Warrior extends Hero {
	//战士的特有属性：物理攻击
	private int pysicalAttack;

	public Warrior() {
		// TODO 自动生成的构造函数存根
	}
	
	public Warrior(String nicString,int pysicalAttack){
		setNickname(nicString);
		setPysicalAttack(pysicalAttack);
	}

	

	public int getPysicalAttack() {
		return pysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		this.pysicalAttack = pysicalAttack;
	}
}
