package arraysDemo;

import java.util.Arrays;
/**
 * ʵ�����鹦��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��13������10:16:59
 */
public class RepeatArr {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		a = Arrays.copyOf(a, 5);// ���鸴�� aΪҪ���Ƶ����� 5Ϊ������ĳ���
		printArr(a);
		a = Arrays.copyOfRange(a, 1, 5);// ���鸴�� aΪҪ���Ƶ����� 1λ��ʼ���� 5Ϊ��ֹ����
		printArr(a);
		Arrays.fill(a, 8);// ������� aΪҪ�������� 8λҪ������ֵ
		printArr(a);
		Arrays.fill(a, 1, 3, 5);// ������� aΪҪ�������� 1λ��ʼ��� 3Ϊ��ֹ����(������)5ΪҪ������ֵ
		printArr(a);
		Arrays.sort(a);// ������������
		printArr(a);
		int index = Arrays.binarySearch(a, 5);// ʹ��ǰ������ ������ֲ��� ����Ҫ����Ԫ�ص���ֵ
		int index2 = Arrays.binarySearch(a, 0, 3, 5);
		System.out.println(index);
		System.out.println(index2);
	}

	public static void printArr(int a[]) {// ��ӡ����
		for (int i : a)
			System.out.printf("%d ",i);
		System.out.println();
	}
	
	public  static void printArrs(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
