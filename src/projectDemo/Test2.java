package projectDemo;

class Test {
	public void F(string s) {
		for (int i = 0; i < s.Length; i += 3)
			System.out.println(s[i]);

		return;
	}

public static void Main( ) 
{ 
String str=“荆州理工智能与软件学院” ;
Test t=new Test( ); 
t.F(str); 
}
}
