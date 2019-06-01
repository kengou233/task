package task;
/**
 * @author kengou
 *	简单猜拳小游戏
 */
public class Human {
	
	public static final int MASSageTypeFist = 1;
	public static final int MASSageTypeWin  = 2;
	public static final int MASSageTypeLOSE = 3;
	private String name;
	private int score;
	private int fist;
	
	private final  String fistWord[] = {
		"你回来啦~~~",
		"大象大象你的鼻子为什么这么长~~~",
		"小姐姐，你喜欢吃青椒嘛~~~",
		"动感光波~~biubiubiu~~~"
	};
	private final String  winword[] = {
		"有点意思~~~",
		"哈哈哈~~~",
		"谁能挡我...嗯？",
		"呀呼~~~"
	};
	private final String [] loseword = {
		"通往成功的路总是在施工...",
		"这谁顶的住啊？",
		"等到湖水退去就知道谁在裸泳了，嘿嘿嘿~~~",
		"尔等把貂蝉藏于何处？"
	};
	
	public void sendMessage(int msgType) {
		int index = ((int)(Math.random()*1000))%5;
		String message= null;
		switch(msgType){
			case MASSageTypeFist:
				message=fistWord[index];
				break;
			case MASSageTypeLOSE:
				message=winword[index];
				break;
			case MASSageTypeWin:
				message=loseword[index];
				break;
		}
		System.out.println(message);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getFist() {
		return fist;
	}
	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
}
