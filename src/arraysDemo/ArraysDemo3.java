package arraysDemo;

import java.util.Arrays;

/**
 * ������arr1������Ϊ2��Ԫ���滻��3 �����������
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��15������1:43:48
 */
public class ArraysDemo3 {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6};
		System.out.printf("�滻ǰ��");
		RepeatArr.printArr(arr1);
		Arrays.fill(arr1,2,3,3);
		int arr2[]=Arrays.copyOf(arr1,5);
		System.out.print("�滻��");
		RepeatArr.printArr(arr2);
	}
}
