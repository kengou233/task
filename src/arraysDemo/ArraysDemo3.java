package arraysDemo;

import java.util.Arrays;

/**
 * 将数组arr1中索引为2的元素替换成3 并将它们输出
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月15日下午1:43:48
 */
public class ArraysDemo3 {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6};
		System.out.printf("替换前：");
		RepeatArr.printArr(arr1);
		Arrays.fill(arr1,2,3,3);
		int arr2[]=Arrays.copyOf(arr1,5);
		System.out.print("替换后：");
		RepeatArr.printArr(arr2);
	}
}
