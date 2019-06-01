package task;
import java.util.Scanner;
/**
 * @author kengou
 *	简单猜拳小游戏
 */
public class Gameroom {
	private Human player1 = null;
	private Complayer player2 = null;
	private long roomId;
	private String roomName;
	private String roomPass;
	public Gameroom() {
		intGame();
		statGame();
		endGame();
	}
	
	public void intGame() {
		//1.实例化游戏玩家对象
		player1 = new Human();
		player2 = new Complayer();
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} 
		}
	}
	public void statGame() {
		showGame();
		choiceGame();
		while(true) {
		System.out.println("猜拳规则：1-剪刀，2-石头，3-布。");
		System.out.println(player1.getName()+"请出拳：");
		Scanner input = new Scanner(System.in);
		player1.setFist(input.nextInt());
		int fist1=player1.getFist();
		player2.getFist();
		int fist2=player2.getFist();
		int result=judge(fist1,fist2);
		if(result==-1) {
			System.out.println("吉永老师："+player1.getName()+"胜利！");
			player1.sendMessage(Human.MASSageTypeWin);
			player2.sendMessage(Human.MASSageTypeLOSE);
		}
		else if(result==1) {
			System.out.println("吉永老师："+player2.getName()+"胜利！");
			player2.sendMessage(Human.MASSageTypeWin);
			player1.sendMessage(Human.MASSageTypeLOSE);
		}
		else {
			System.out.println("吉永老师：平局！");
			player1.sendMessage(Human.MASSageTypeFist);
			player2.sendMessage(Human.MASSageTypeFist);
		}
		System.out.println("是否继续游戏？");
		char answer = new Scanner(System.in).next().charAt(0);
		if(answer!='y')
			break;
		}
	}
	public void showGame() {

		System.out.println("\n欢迎进入《"+roomName+">游戏房间");
	
	}
	
	public void choiceGame() {
		System.out.println("请选择对手：1-正南，2-妮妮，3-风间");
		int choice =new Scanner(System.in).nextInt();
		String[] nameArray= {"正南","妮妮","风间"};
		player2.setName(nameArray[choice-1]);
		player1.setName("小新");
		System.out.println(player1.getName()+"VS"+player2.getName());
	}
	public int judge(int a,int b) {
		if(a==b) return 0;
		if(a==1&&b==3||a==2&&b==1||a==3&&b==2) {
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return -1;
		}
		else {
			player1.setScore(player1.getScore()-1);
			player2.setScore(player2.getScore()+1);
			return 1;
		}
	}
	public void endGame() {
		System.out.println("游戏结束欢迎再来！");
	}
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	
}
