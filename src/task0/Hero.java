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
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int getx() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO 自动生成的方法存根

	}

	@Override
	public int getHP() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public void setHP(int hp) {
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean canFight(Assailable assa) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void fight(Assailable assa) {
		// TODO 自动生成的方法存根

	}

}
