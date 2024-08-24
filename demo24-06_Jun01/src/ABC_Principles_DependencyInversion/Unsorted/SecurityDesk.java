package ABC_Principles_DependencyInversion.Unsorted;

public class SecurityDesk {
    public String receive(String username){
        System.out.println("Security approves this username.");
        return username;
    }
}
