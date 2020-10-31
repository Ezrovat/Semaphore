package synhcronizer;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		for(int i = 0; i < 5; i++) {
			Customer c = new Customer(i, cinema);
			Thread t = new Thread(c);
			t.start();
		}
	}
}
