package arraysDemo;

/**
 * 编写程序将二维数组的行列互换
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月15日下午1:54:59
 */
public class ArraysDemo4 {
	public static void main(String[] args) {
		int arr1[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("换行列前:");
		RepeatArr.printArrs(arr1);
		System.out.println("换行列后：");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
