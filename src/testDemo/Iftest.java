package testDemo;

import java.util.Scanner;

/**
 * if����Ӧ��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��7��13������1:52:16
 */
public class Iftest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������˰ǰ���ʣ�");
		//˰ǰ����
		int num = input.nextInt();
		//Ӧ��˰���ö�
		int x=num-3500;
		//Ӧ����˰
		double y=0;
		//ʵ������
		double k=0;
		if(x==1500) 
		{
			y=(x-262)*0.03;
			k=num-y-262;
		}
		if(x>=9001&&x<=35000) 
		{
			y=(x-262)*0.25-1005;
			k=num-y-262;
		}
		System.out.printf("����Ӧ��˰��Ϊ��%.2f\n",y);
		System.out.printf("����ʵ������Ϊ��%.2f\n",+k);
	}
}
