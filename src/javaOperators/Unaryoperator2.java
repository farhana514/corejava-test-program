package javaOperators;

public class Unaryoperator2 {

	public static void main(String[] args) {

	int a = 5;
	int b= 6;
	System.out.println(a--);
	System.out.println(--a);
	System.out.println(b--);
	System.out.println(b--);
	System.out.println(a++);
	System.out.println(a++);
	System.out.println(--b);
	System.out.println(--b);
	System.out.println(a++);
	System.out.println(b++);	
	System.out.println(a--);
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println("a value" +a);
	System.out.println("b value:"+b);	
		
	System.out.println(++a + ++b + --a + ++b);
	System.out.println(a++ + b++ - ++a - --b);
	}

}
