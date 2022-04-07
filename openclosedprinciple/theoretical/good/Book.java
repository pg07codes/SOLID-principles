public class Book {
    public void showBookCoverPage() {
        System.out.println("This is a book");
    }
}


// below classes should be public class in NovelBook.java/PoemBook.java 
// added here for readability purposes
class NovelBook extends Book {
    @Override
    public void showBookCoverPage() {
        System.out.println("This is a novel");
    }
}

class PoemBook extends Book {
    @Override
    public void showBookCoverPage() {
        System.out.println("This is a poem book");
    }
}

// extends any number of new books without impacting the existing ones