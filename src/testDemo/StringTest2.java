package testDemo;

/**
 * ��ת�ַ���
 * ����
 * 1.���ַ����������
 * 2.�����鷴ת
 * 3.���������ַ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��18������5:27:53
 */
public class StringTest2 {
	public static void main(String[] args) {
		String a ="�Բ� ��˭����ס��";
		char b[]=a.toCharArray();
		System.out.println(reverse(b));
		System.out.println(reverse(b,0,8));
	}
	public static String reverse(char b[]) {
		for(int i=0,end=b.length-1;i<end;i++,end--) {
			swap(b,i,end);
		}
//		for(int i=0;i<=(b.length-1)/2;i++) {
//		swap(b,i,(b.length-1)-i);
//	}
		return new String(b);
	}
	public static String reverse(char b[],int a,int c) {
		for(;a<c;a++,c--) {
			swap(b,a,c);
		}
		return  new String(b);
	}
	public static void swap(char x[], int a, int b) {
		char temp=x[a];
		x[a]=x[b];
		x[b]=temp;	
	}
}


