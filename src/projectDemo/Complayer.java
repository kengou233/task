package projectDemo;
/**
 * @author kengou
 *	�򵥲�ȭС��Ϸ
 */
public class Complayer {
	
	private static final int MASSageTypeFist = 1;
	private static final int MASSageTypeWin  = 2;
	private static final int MASSageTypeLOSE = 3;
	private String name;
	private int score;
	private int fist;
	
	private final  String fistWords[] = {
		"�������~~~",
		"���������ı���Ϊʲô��ô��~~~",
		"С��㣬��ϲ�����ཷ��~~~",
		"���йⲨ~~biubiubiu~~~"
	};
	private final String [] winword = {
		"�е���˼~~~",
		"������~~~",
		"˭�ܵ���...�ţ�",
		"ѽ��~~~"
	};
	private final String [] loseword = {
		"ͨ���ɹ���·������ʩ��...",
		"��˭����ס����",
		"�ȵ���ˮ��ȥ��֪��˭����Ӿ�ˣ��ٺٺ�~~~",
		"���Ȱ��������ںδ���"
	};
	
	public void sendMessage(int msgType) {
		int index = ((int)(Math.random()*1000))%5;
		String message= null;
		switch(msgType){
			case MASSageTypeFist:
				message=fistWords[index];
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
		fist = ((int)(Math.random()*10000))%3+1;
		return fist;
	}

	
}
