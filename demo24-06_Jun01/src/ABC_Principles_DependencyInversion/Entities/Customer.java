package ABC_Principles_DependencyInversion.Entities;

public class Customer {

    String username;

    //constructor
    /*
    DIP: Dependency Inversion Principle,
    See file "Solid_Principles" for full explanation




     */
    public Customer(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
