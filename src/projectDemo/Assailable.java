package projectDemo;
/**
 * ֻҪ���㱾�ӿ� ���ɹ����κ�Ŀ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��1������4:27:32
 */
public interface Assailable {
	String getName();
	int getx();
	void setX(int x);
	int getHP();
	void setHP(int hp);
/**
 * ���ݾ����ж� �Ƿ���Թ�������һ��Ŀ��
 */
	boolean canFight(Assailable assa);
/**
 * ����
 */
	void fight(Assailable assa);
}
