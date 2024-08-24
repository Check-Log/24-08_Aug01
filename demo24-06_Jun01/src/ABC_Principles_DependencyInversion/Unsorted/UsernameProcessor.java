package ABC_Principles_DependencyInversion.Unsorted;

public class UsernameProcessor {

    private final Keypad keypad;
    private final SecurityDesk securityDesk;


    public UsernameProcessor(Keypad keypad, SecurityDesk securityDesk) {
        this.keypad = keypad;
        this.securityDesk = securityDesk;
    }

    public void printUsername() {
        System.out.println("Username is: " + securityDesk.receive(keypad.getValue()));
    }

}
