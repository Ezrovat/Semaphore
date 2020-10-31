package synhcronizer;

import java.util.concurrent.Semaphore;

public class Cinema {

	private Semaphore seats;
	
	public Cinema() {
		seats = new Semaphore(3);
	}
	
	public void book(int idClient) throws InterruptedException {
		System.out.println("Requested seat from customer " + idClient);
		seats.acquire();
		System.out.println("Seat assigned to customer " + idClient);
	}
	
	public void release(int idClient) {
		System.out.println("Customer " + idClient + " release the seat");
		seats.release();
	}
}
