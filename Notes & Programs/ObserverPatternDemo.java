
import java.util.*;

interface Observer {
	void update(double price);
}

class EmailNotifier implements Observer {
	public void update(double price) {
		System.out.println("Email sent: Stock price updated to " + price);
	}
}

class SMSNotifier implements Observer {
	public void update(double price) {
		System.out.println("SMS sent: Stock price updated to " + price);
	}
}

class StockMarket {
	private List<Observer> observers = new ArrayList<>();
	private double price;

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}

	private void notifyObservers() {
		for (Observer o : observers)
			o.update(price);
	}
}

public class ObserverPatternDemo {
	public static void main(String[] args) {
		StockMarket market = new StockMarket();
		market.addObserver(new EmailNotifier());
		market.addObserver(new SMSNotifier());

		market.setPrice(100.5); // Both observers notified
	}
}
