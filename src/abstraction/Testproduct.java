package abstraction;

public class Testproduct {

	public static void main(String[] args) {
		Products e = new Electronics(101," laptop",60000,"dell");
				Clothing c = new Clothing(102," dress",15000,"xxl");
				Furniture f = new Furniture(103," laptop-table",7000," wood");
				
				System.out.println("*****************electronics*******************8");
				e.ProductDetails();
				double discount1 = e.CalculateDiscount();
				System.out.println("discount:"+ discount1);
				System.out.println("final prices:"+(e.price - discount1));
				System.out.println("final prices:"+(e.price - discount1));
				
				System.out.println("*************clothing*******************");
				e.ProductDetails();
				double discount2 = c.CalculateDiscount();
				System.out.println("discount:"+(c.price - discount2));
				System.out.println("final prices:"+(c.price-discount2));
				
				System.out.println("***********furniture************");
				f.ProductDetails();
				double discount3 = f.CalculateDiscount();
				System.out.println("discount:"+discount1);
				System.out.println("final prices:"+(f.price- discount2));
				
				
		

	}

}
