
public class Car extends Product {

	@Override
	public double calculateTaxIncludedPrice() {

		return getBasePrice() * 1.60 * 1.18;
	}

}
