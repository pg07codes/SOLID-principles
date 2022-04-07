public interface AuthorAble {
    void getAuthor();
}

public interface BiographyAble {
    void getWhoseLifeIsBookOn();
}

// all classes/interfaces are kept in one file here for readability

public class NovelInfo implements AuthorAble {
    public void getAuthor() {
        // get from db and return
    }
}

public class AutobiographyInfo implements AuthorAble,BiographyAble  {
    public void getAuthor() {
        // get from db and return
    }
    public void getWhoseLifeIsBookOn() {
        // get and return
    }
}