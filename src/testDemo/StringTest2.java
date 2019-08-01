package testDemo;

/**
 * 反转字符串
 * 步骤
 * 1.将字符串变成数组
 * 2.将数组反转
 * 3.将数组变成字符串
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月18日下午5:27:53
 */
public class StringTest2 {
	public static void main(String[] args) {
		String a ="卧槽 这谁顶得住啊";
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


