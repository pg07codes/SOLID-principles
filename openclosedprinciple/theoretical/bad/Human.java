public class Human {

    private String gender;

    // as you can see, we'll need to update this method as and when new
    // genders are introduced in our ever modernising society

    public void introduce() {
        if ("male".equals(gender)) {
            System.out.println("Heyy, I am a male");
        } else if ("female".equals(gender)) {
            System.out.println("Hi, I am a female");
        } else {
            System.out.println("I am a human");
        }
    }
}