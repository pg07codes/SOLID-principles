public class Bird{

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}

// all below classes should be public and placed in their respective files
// kept here for readability

class FlyingBirds extends Bird{
    
    public void fly(){
        System.out.println("I am flying...");
    }
}
class Duck extends FlyingBirds{

}
class Ostrich extends Bird{

}