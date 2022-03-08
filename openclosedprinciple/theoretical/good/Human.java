public class Human {
    public void introduce() {
        System.out.println("I am a Human");
    }
}


// below classes should be public class in Male.java/Female.java 
// added here for readability purposes
class Male extends Human {
    @Override
    public void introduce() {
        System.out.println("Heyy, I am a male");
    }
}

class Female extends Human {
    @Override
    public void introduce() {
        System.out.println("Hi, I am a female");
    }
}

// extends any number of new genders without impacting the existing ones