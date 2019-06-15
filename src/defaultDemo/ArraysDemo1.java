package defaultDemo;

import java.util.Arrays;
/**
 * 将arr1中索引为0~3的值复制给arr2
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月14日下午10:35:56
 */
public class ArraysDemo1 {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]=Arrays.copyOfRange(arr1,0,3);
		RepeatArr.printArr(arr1);
		RepeatArr.printArr(arr2);
	}
}
