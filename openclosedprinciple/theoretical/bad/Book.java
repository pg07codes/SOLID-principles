public class Book {

    private String type;

    // as you can see, we'll need to update this method as and when new
    // types are introduced (maybe an academic textbook needs to be added)

    public void showBookCoverPage() {
        if ("novel".equals(type)) {
            System.out.println("This is a novel");
        } else if ("poem".equals(type)) {
            System.out.println("This is a poem book");
        } else {
            System.out.println("This is a book");
        }
    }
}