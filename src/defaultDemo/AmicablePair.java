package defaultDemo;
/**
 * ���������˴˳���������������� ���� �˴�
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��13������12:02:33
 */
public class AmicablePair {
	public static void main(String[] args) {
		// ������һ�� ���ʲô...˼����...
		// ���� �������� �ٺ�
		for (int i = 1; i < 9999; i++) {
			int n = factor(i);
			if (i > n && factor(n) == i)// ���ǰһ���������������Ӻ� ���� �������Ӻ͵����Ӻ͵���������
				System.out.println(i + "\t" + n);
		}
	}
	/**
	 * �������ֳ��������������������
	 */
	public static int factor(int i) {
		int sum = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}
		return sum;
	}
}
