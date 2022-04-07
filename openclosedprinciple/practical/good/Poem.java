
public class Poem extends Book {

	@Override
	public double calculateTaxIncludedPrice() {
		return getPrice() * 1.60 * 1.18;
	}

}
