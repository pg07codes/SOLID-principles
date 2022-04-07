public interface BookInfo {
    
    void getAuthor();
    void getWhoseLifeIsBookOn();
}

// below classes are kept here for readability

public class NovelInfo implements BookInfo {
    public void getAuthor() {
        // get author from db and return
    }
    public void getWhoseLifeIsBookOn() {
        throw new IllegalStateException("not all books are biographies");
    }
}


public class AutobiographyInfo implements BookInfo {

    public void getAuthor() {
    
    }

    public void getWhoseLifeIsBookOn() {
        // get from db and return
    }
}

// as you can see that anyone implementing the BookInfo interface is forced to 
// implement the "getWhoseLifeIsBookOn" method which might not even be required
// that is why it violates ISP