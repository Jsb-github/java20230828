package Ch05reference;

public class C07reference {
	public static void main(String[] args) {
		String a = "java";
		String b = "spring";
		String c= a;
		
		
	  int code1 = System.identityHashCode(a); // 주소값 확인
	  int code2 = System.identityHashCode(b);
	  int code3 = System.identityHashCode(c);
	  
	  System.out.println(code1);
	  System.out.println(code2);
	  System.out.println(code3);
	  
	  
	}
}
