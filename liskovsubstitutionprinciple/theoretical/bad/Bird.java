public class Bird{
    
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void fly(){
        System.out.println("I am flying...");
    }
}

//should ideally be a public class in seperate file
// kept here for readability
class Duck extends Bird{

}

class Ostrich extends Bird{

    // clearly, Ostrich is a bird, but it can't fly, Ostrich class is a 
    // subtype of class Bird, but it should't be able to use the fly method, 
    // that means we are breaking the LSP principle.
}