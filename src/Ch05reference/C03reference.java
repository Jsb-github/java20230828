package Ch05reference;

public class C03reference {
	public static void main(String[] args) {
		int a= 5;
		int b= a;
		
		String c= "java";
		String d =c;
		
		System.err.println(a==b); //true
		
		System.out.println(d==c); // true
		
	}
}
