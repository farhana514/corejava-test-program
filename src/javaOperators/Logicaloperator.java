package javaOperators;

public class Logicaloperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 150;
		int c = 10;
		//logical &&
		
		System.out.println("Logical && operator");
		System.out.println("---------------------");
		System.out.println("ture&&false");
		System.out.println("ture&&false");
		//System.out.println("false&&false");//dead code: first false is always dead code
		//System.out.println("ture&&false");
		
		
		System.out.println("a<b&&b>c");
		System.out.println("a<b&&b<c");
		System.out.println("a>b&&b>c");
		System.out.println("a>b&&b<c");
		//logical||
		System.out.println("logical || operator....");
		System.out.println("----------------");
		//System.out.println("false||true);//dead code
		//System.out.println("false||true);//dead code: first ture is always dead code
		System.out.println("false||ture");
		System.out.println("false||false");
		
		System.out.println(a<b||b>c);
		System.out.println(a<b||b>c);
		System.out.println(a>b||b>c);
		System.out.println(a>b||b<c);
		
		int x = 20;
		int y = 30;
		
		
		System.out.println(++x <++y ||++x <++y);
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
		
		System.out.println(++x > ++y ||++x > ++y);
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
		
		
	}

}
