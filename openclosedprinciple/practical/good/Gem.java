
public class Gem extends Product {

	@Override
	public double calculateTaxIncludedPrice() {

		return getBasePrice();
	}

}
