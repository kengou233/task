package arraysDemo;

/**
 * ��д���򽫶�ά��������л���
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��15������1:54:59
 */
public class ArraysDemo4 {
	public static void main(String[] args) {
		int arr1[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("������ǰ:");
		RepeatArr.printArrs(arr1);
		System.out.println("�����к�");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
