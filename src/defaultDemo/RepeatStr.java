package defaultDemo;

/**
 * ��ʹ���ַ���
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��15������3:27:42
 */
public class RepeatStr {
	public static void main(String[] args) {
		String str = new String("good good study");

		String str1 = str.trim();// ����ȡ��ǰ��˿ո�

		String str2 = str.replace("g", "G");// �����滻�ַ������ַ�

		String str3 = str.toUpperCase();// ���ڰ��ַ����������ַ�ת��Ϊ��д
		String str4 = str3.toLowerCase();// ���ڰ��ַ����������ַ�ת��ΪСд

		boolean a = str.startsWith("good");// �ж��ַ����Ƿ���ָ���ַ���ͷ
		boolean b = str.endsWith("study");// �ж��ַ����Ƿ���ָ���ַ���β

		boolean c = str.equals(str2);// �ж��ַ������ַ����ַ��������Ƿ���� ���ִ�Сд
		boolean d = str.equalsIgnoreCase(str2);// �ж��ַ������ַ����ַ��������Ƿ���� �����ִ�Сд

		int e = str.compareTo(str2);// �ж��ַ����Ƿ���� ���ڷ������� С�ڷ��ظ��� ���ڷ�����

		int index1 = str.indexOf(" "); // �����ַ������ַ���һ�γ��ֵ�����
		int index2 = str.lastIndexOf(" "); // �����ַ������ַ����һ�γ��ֵ�����

		char mychar = str.charAt(0); // ��ȡ����λ�õ��ַ�

		String substr1 = str.substring(10);// ��ָ��λ�ÿ�ʼ��ȡ�ַ��� �����ַ����Ľ�βΪֹ
		String substr2 = str.substring(0, 4);

		String Spstr1[] = str.split("d");
		printStr(Spstr1);// ָ���ַ��ָ� �ַ���
		String Spstr2[] = str.split("d", 2);
		printStr(Spstr2);// �ָ��ַ��� ָ������

		StringBuffer bf = new StringBuffer("�Բ���ô��");// �����ַ���������
		bf.append("��");
		System.out.println(bf);// �������������
		bf.insert(2, " ");
		System.out.println(bf);// ָ���в�������
		bf.delete(bf.length() - 1, bf.length());
		System.out.println(bf);// ɾ��ָ����֮�������
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
