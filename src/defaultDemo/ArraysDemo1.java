package defaultDemo;

import java.util.Arrays;
/**
 * ��arr1������Ϊ0~3��ֵ���Ƹ�arr2
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��14������10:35:56
 */
public class ArraysDemo1 {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]=Arrays.copyOfRange(arr1,0,3);
		RepeatArr.printArr(arr1);
		RepeatArr.printArr(arr2);
	}
}
