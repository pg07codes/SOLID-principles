
import java.util.List;

public class BookCheckoutService {

	public double calculateTotalOrder(List<Book> books) {

		double orderTotal = 0;

		for (Book book : books) {

			orderTotal += book.calculateTaxIncludedPrice();
		}

		return orderTotal;
	}

}
