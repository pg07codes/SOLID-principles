
public abstract class Book {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * this can be implemented by the specific book which we extend from this abstract book class
	 */
	public abstract double calculateTaxIncludedPrice();


}
