
public class Novel extends Book {

	@Override
	public double calculateTaxIncludedPrice() {
		return getPrice() + getPrice() * 1.08;
	}

}
