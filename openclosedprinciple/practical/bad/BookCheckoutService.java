
import java.util.List;

public class BookCheckoutService {

	public double calculateTotalOrder(List<Book> books) {

		double orderTotal = 0;

		for (Book book : books) {

			if ("novel".equals(book.getType())) {
				orderTotal += book.getPrice() + book.getPrice() * 0.08;
			} else if ("poem".equals(book.getType())) {
				orderTotal += book.getPrice() * 1.60 * 1.18;
			} else if ("academic".equals(book.getType())) {
				orderTotal += book.getPrice() * 1.18;
			}
		}

		return orderTotal;
	}

}
