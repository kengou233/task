package stringDemo;

/**
 * 使用字符串生成器 追加1~10十个数字
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月16日上午10:28:43
 */
public class StringDemo4 {
	public static void main(String[] args) {
		StringBuffer bf =new StringBuffer("没想到吧 嘿嘿");
		for(int i=1;i<11;i++) {
			bf.append(i);
		}
		System.out.println(bf);
	}
}
