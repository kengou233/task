package task4;

public class Warrior extends Hero {
	//սʿ���������ԣ�������
	private int pysicalAttack;

	public Warrior() {
		// TODO �Զ����ɵĹ��캯�����
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
