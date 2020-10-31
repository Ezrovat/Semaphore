package synhcronizer;

public class Customer implements Runnable {

	int id;
	Cinema cinema;
	
	public Customer(int id, Cinema cinema) {
		this.id = id;
		this.cinema = cinema;
	}
	
	@Override
	public void run() {
		try {
			cinema.book(id);
			Thread.sleep(10000);
			cinema.release(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
