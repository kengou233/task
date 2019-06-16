package projectDemo;
/**
 * 只要满足本接口 即可攻击任何目标
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月1日下午4:27:32
 */
public interface Assailable {
	String getName();
	int getx();
	void setX(int x);
	int getHP();
	void setHP(int hp);
/**
 * 根据距离判断 是否可以攻击到另一个目标
 */
	boolean canFight(Assailable assa);
/**
 * 攻击
 */
	void fight(Assailable assa);
}
