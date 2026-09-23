package javaliterals;

public class Mobilerecharge {
	void ShowPlandetails() {
		System.out.println("Current recharge plan");
		System.out.println("plan name: unlimited 299");
		System.out.println("validity: 28 days");
		System.out.println("data: 1.5 gb/day");
		System.out.println(" calls: umlimited");
	}
		
		void recharge(double amount) {
			System.out.println("Recharge successfull!!");
			System.out.println("recharge amount :"  + amount );
			
		
	}
	
	    void main() {
		
		ShowPlandetails();
		recharge(299.0);
		
	}

	}


