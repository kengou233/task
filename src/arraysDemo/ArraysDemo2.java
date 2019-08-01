package arraysDemo;

import java.util.Arrays;

/**
 * 找到数组中的最小值并输出 提示 可以先升序排序然后打印 第一个值
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月15日下午1:20:32
 */
public class ArraysDemo2 {
	public static void main(String[] args) {
		int arr[] = { 8, 9, 1, 11, 12 };
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
