package defaultDemo;

import java.util.Random;

/**
 * ʹ����ѧ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��31������4:56:21
 */
public class MathDemo1 {
	public static void main(String[] args) {
		double a = Math.ceil(3.14);//���ش���ָ�����ݵ���ֵ
		double b = Math.floor(3.14);//����С��ָ�����ݵ���ֵ
		long c = Math.round(3.14);//��������
		int d = (int) Math.pow(2,3);//����ָ�� ָ�������Ĳ����η�
		int e =(int) (Math.random()*10+1);//����0~10֮��������
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int f = random.nextInt(10);//����0~10(������)֮��������
			System.out.println(f);
		}
	}
}
