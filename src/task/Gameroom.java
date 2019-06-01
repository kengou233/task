package task;
import java.util.Scanner;
/**
 * @author kengou
 *	�򵥲�ȭС��Ϸ
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
		//1.ʵ������Ϸ��Ҷ���
		player1 = new Human();
		player2 = new Complayer();
		for (int i = 0; i < 40; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} 
		}
	}
	public void statGame() {
		showGame();
		choiceGame();
		while(true) {
		System.out.println("��ȭ����1-������2-ʯͷ��3-����");
		System.out.println(player1.getName()+"���ȭ��");
		Scanner input = new Scanner(System.in);
		player1.setFist(input.nextInt());
		int fist1=player1.getFist();
		player2.getFist();
		int fist2=player2.getFist();
		int result=judge(fist1,fist2);
		if(result==-1) {
			System.out.println("������ʦ��"+player1.getName()+"ʤ����");
			player1.sendMessage(Human.MASSageTypeWin);
			player2.sendMessage(Human.MASSageTypeLOSE);
		}
		else if(result==1) {
			System.out.println("������ʦ��"+player2.getName()+"ʤ����");
			player2.sendMessage(Human.MASSageTypeWin);
			player1.sendMessage(Human.MASSageTypeLOSE);
		}
		else {
			System.out.println("������ʦ��ƽ�֣�");
			player1.sendMessage(Human.MASSageTypeFist);
			player2.sendMessage(Human.MASSageTypeFist);
		}
		System.out.println("�Ƿ������Ϸ��");
		char answer = new Scanner(System.in).next().charAt(0);
		if(answer!='y')
			break;
		}
	}
	public void showGame() {

		System.out.println("\n��ӭ���롶"+roomName+">��Ϸ����");
	
	}
	
	public void choiceGame() {
		System.out.println("��ѡ����֣�1-���ϣ�2-���ݣ�3-���");
		int choice =new Scanner(System.in).nextInt();
		String[] nameArray= {"����","����","���"};
		player2.setName(nameArray[choice-1]);
		player1.setName("С��");
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
		System.out.println("��Ϸ������ӭ������");
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
