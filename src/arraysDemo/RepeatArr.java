package arraysDemo;

import java.util.Arrays;
/**
 * 实现数组功能
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月13日下午10:16:59
 */
public class RepeatArr {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		a = Arrays.copyOf(a, 5);// 数组复制 a为要复制的数组 5为新数组的长度
		printArr(a);
		a = Arrays.copyOfRange(a, 1, 5);// 数组复制 a为要复制的数组 1位起始索引 5为终止索引
		printArr(a);
		Arrays.fill(a, 8);// 数组填充 a为要填充的数组 8位要填充的数值
		printArr(a);
		Arrays.fill(a, 1, 3, 5);// 数组填充 a为要填充的数组 1位起始填充 3为终止索引(不包括)5为要填充的数值
		printArr(a);
		Arrays.sort(a);// 数组升序排序
		printArr(a);
		int index = Arrays.binarySearch(a, 5);// 使用前先排序 数组二分查找 返回要查找元素的数值
		int index2 = Arrays.binarySearch(a, 0, 3, 5);
		System.out.println(index);
		System.out.println(index2);
	}

	public static void printArr(int a[]) {// 打印数组
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
