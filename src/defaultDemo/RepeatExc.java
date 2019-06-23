package defaultDemo;

/**
 * �����쳣 
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��19������8:53:00
 */
public class RepeatExc {
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("��� 500...");
		c.deposit(500.00);
		try {
			System.out.println("\nȡ�� 100Ԫ...");
			c.withdraw(100.00);
			System.out.println("\nȡ�� 600Ԫ...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("�Բ����㻹��Ҫ " + e.getAmount()+"Ԫ");
//			e.getMessage();
//			e.toString();
			e.printStackTrace();
		}
	}
}
//�ʽ���
class InsufficientFundsException extends Exception {
	// �˴���amount�������浱�����쳣��ȡ��Ǯ�������ʱ����ȱ����Ǯ
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}

class CheckingAccount {
	// balanceΪ��numberΪ����
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	// ��������Ǯ
	public void deposit(double amount) {
		balance += amount;
	}

	// ������ȡǮ
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	// �������������
	public double getBalance() {
		return balance;
	}

	// ���������ؿ���
	public int getNumber() {
		return number;
	}
}