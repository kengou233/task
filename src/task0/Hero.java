package task0;

public abstract class Hero implements Assailable {
	private String nickname;
	private int level;
	private int maxLife;
	private int currLife;

	public Hero(String nickname, int level, int maxLife, int currLife) {
		super();
		this.nickname = nickname;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public int getx() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public int getHP() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public void setHP(int hp) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public boolean canFight(Assailable assa) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public void fight(Assailable assa) {
		// TODO �Զ����ɵķ������

	}

}
