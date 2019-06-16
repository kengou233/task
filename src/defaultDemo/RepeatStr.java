package defaultDemo;

/**
 * 简单使用字符串
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月15日下午3:27:42
 */
public class RepeatStr {
	public static void main(String[] args) {
		String str = new String("good good study");

		String str1 = str.trim();// 用于取消前后端空格

		String str2 = str.replace("g", "G");// 用于替换字符串中字符

		String str3 = str.toUpperCase();// 用于把字符串内所有字符转换为大写
		String str4 = str3.toLowerCase();// 用于把字符串内所有字符转换为小写

		boolean a = str.startsWith("good");// 判断字符串是否以指定字符开头
		boolean b = str.endsWith("study");// 判断字符串是否以指定字符结尾

		boolean c = str.equals(str2);// 判断字符串中字符和字符串长度是否相等 区分大小写
		boolean d = str.equalsIgnoreCase(str2);// 判断字符串中字符和字符串长度是否相等 不区分大小写

		int e = str.compareTo(str2);// 判断字符串是否相等 大于返回正数 小于返回负数 等于返回零

		int index1 = str.indexOf(" "); // 查找字符串中字符第一次出现的索引
		int index2 = str.lastIndexOf(" "); // 查找字符串中字符最后一次出现的索引

		char mychar = str.charAt(0); // 获取索引位置的字符

		String substr1 = str.substring(10);// 从指定位置开始截取字符串 到该字符串的结尾为止
		String substr2 = str.substring(0, 4);

		String Spstr1[] = str.split("d");
		printStr(Spstr1);// 指定字符分割 字符串
		String Spstr2[] = str.split("d", 2);
		printStr(Spstr2);// 分割字符串 指定次数

		StringBuffer bf = new StringBuffer("卧槽这么屌");// 创建字符串生成器
		bf.append("？");
		System.out.println(bf);// 无限制添加内容
		bf.insert(2, " ");
		System.out.println(bf);// 指定行插入内容
		bf.delete(bf.length() - 1, bf.length());
		System.out.println(bf);// 删除指定行之间的内容
//		System.out.println(str);
//		System.out.println(str2);
//		System.out.println(str3 + " " + str4);
//		for(String i:str5)
//		System.out.print(i);
//		System.out.println();
//		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
//		System.out.println(index1 + " " + index2);
//		System.out.println(substr1 + " " + substr2);
//		System.out.println(mychar);
	}

	public static void printStr(String a[]) {
		for (String i : a)
			System.out.print(i + " ");
		System.out.println();
	}
}
