package Tasks;

public class ShopingcartUsingEncapsulation {
	private int cartItems;
	private double totalAmount;
	
	public void addItem(double price) {
		cartItems++;
		totalAmount = totalAmount + price;
	}

	public void removeItem(double price) {
		if (cartItems >0) {
			cartItems--;
			totalAmount = totalAmount - price;
		}else {
			System.out.println("cart is empty:");
		}
		}
	
	public double gettotal() {
		return totalAmount;
	}
	public static void main(String[]args) {
		 ShopingcartUsingEncapsulation cart = new  ShopingcartUsingEncapsulation();
		cart.addItem(500);
		cart.addItem(300);
		cart.addItem(200);
		
		cart.removeItem(300);
		
		System.out.println("total amount :"+ cart.gettotal());
			
		}
	}
	


