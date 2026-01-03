
class StockMarket {
	private double price;

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Email sent: Stock price updated to " + price);
		System.out.println("SMS sent: Stock price updated to " + price);
	}
}

public class NoPatternDemo {
	public static void main(String[] args) {
		StockMarket market = new StockMarket();
		market.setPrice(100.5);
	}
}
