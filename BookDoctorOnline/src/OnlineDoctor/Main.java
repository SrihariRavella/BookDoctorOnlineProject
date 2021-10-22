package OnlineDoctor;


public class Main {
		
	public static void main(String[] args) throws InterruptedException {
		try {
			Service.header();
			System.out.println("\nWelcome To Online Doctor Appointment");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Service.body();
	}

}
