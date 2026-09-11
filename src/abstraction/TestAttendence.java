package abstraction;

public class TestAttendence {

	public static void main(String[] args) {
		Attendence D = new Developer();
		Attendence T = new Tester();
		Attendence M= new Manager();
		
		D.markAttendence ();
		T.markAttendence();
		M.markAttendence();

	}

}
