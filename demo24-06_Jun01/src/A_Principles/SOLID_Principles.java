package A_Principles;


import AB_Principles_InterfaceSeg.Bard;
import AB_Principles_InterfaceSeg.Mage;
import AB_Principles_InterfaceSeg.Paladin;
import AB_Principles_InterfaceSeg.Rogue;
import A_Principles_Liskov.ArcherPlayer;
import A_Principles_Liskov.BowmanPlayer;
import A_Principles_Liskov.CrossbowManPlayer;
import A_Principles_Liskov.Player;

public class SOLID_Principles {

    public void run() {
        System.out.println("------------------SOLID Principles-------------------------");
        //---------------------------------------
        //1. Single Responsibility:
        // each class should have 1 responsibility, a single purpose
        //(e.g. laserBattery and thrusterBattery)
        //Each class has a small number of methods that process minimal data.
        LaserCannon laserCannon = new LaserCannon();
        laserCannon.getLaserBattery();
        laserCannon.printRemainingLaserBattery();
        laserCannon.getThrusterBattery();
        //e.g. class LaserCannon has getLaserBattery, printLaserBattery and getThrusterBattery
        //this does not comply with SRP; this class should only get Laser Battery, not the Engine Battery



        //2. Open Closed:
        //Leave the entity Open for extension, but Closed for modification
        // (e.g. Shape, circle, rectangle, calculate RectangleArea vs calculateArea)
        //abstract class shape, contains function calculate rectangleArea,
        //Being specific, it wouldn't suit initialising circle or triangle, which will require a different formula
        //instead use calculateArea, keep it vague
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        //System.out.println("Arena area is: " + rectangle.calculateRectangleArea()); //WRONG
        System.out.println("Arena area is: " + rectangle.calculateArea()); //CORRECT

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("Battle-Ring area is: " + circle.calculateArea());
        System.out.println("-------------------------");
        //--------------------------------------------------------------------------------------
        //3. Liskov Substitution, Subtypes must be substitutable for their Supertypes.
        /*
        Liskov Substitution is extremely easy to make an example for,
        all you need is 6 classes.
        Not all accounts use focus, so move the focus-method from Player Class to a new subclass Archer
        Both Bowman and Crossbow use focus, so they've been made subclasses of the Archer subclass
        This means ArcherSkillService has the right type of player to provide archer skills
        simpilicty and code minimization
        the following would all be within ArcherSkillService
        the following demonstrate super-class and sub-class usage
        */
        System.out.println("-------------------------");
        Player archerPlayer1 = new ArcherPlayer(50,50); //doesn't allow subclass-specific methods (real underlying type??)
        //archerPlayer1.focus(); //uncompilable, variable references Player class, not ArcherPlayer, focus() not visible
        ((ArcherPlayer) archerPlayer1).focus(40); //compilable, only because of Type-casting (not understood)
        Player archerPlayer2 = new ArcherPlayer(40, 40);
        archerPlayer2.heal(40);//compilable, demonstrates override heal() of reference-variable known as archerPlayer2
        ArcherPlayer archerPlayer3 = new ArcherPlayer(50, 50);
        archerPlayer3.focus(40); //compilable, variable aP3 references ArcherPlayer class, not Player
        BowmanPlayer bowman_player = new BowmanPlayer(40,50);
        bowman_player.focus(30);
        CrossbowManPlayer crossbowMan_player = new CrossbowManPlayer(30,60); //control + H to see hierarchy
        crossbowMan_player.focus(10);
        System.out.println("-------------------------");
        //Player archerPlayer6 = new Player(50,50); //proves that Player is now abstract
        //
        //https://www.baeldung.com/java-liskov-substitution-principle

        //--------------------------------------------------------------------------------------
        //4. Interface Segregatation
        //Principle is to split larger interfaces into smaller ones
        //https://www.baeldung.com/java-interface-segregation
        /*
        Create a Levelling-interface and some Levelling-classes: Rogue and Paladin
        Add additional methods for class Paladin "initiateMoralPoints" & "initiateMoralPointsReduction"
        Levelling interface has changed, so all implementing classes have to implement the new methods.
        This risks unwanted side effects (e.g. compile time errors, mass file modification),
        Now Rogue-Levelling implementation class has to implement the initiateMoralPoints() and IMPR()
        without any actual need for it. Interface Segregation principle is violated.
        Ill-advised workaround would be to throw an UnsupportedOperationException. (Nope, how do we fix it?)
        */
        Rogue rogue = new Rogue();
        rogue.crimeScore();
        //rogue.initiateMoralPoints(); //throws unsupported operation exception
        Paladin paladin = new Paladin();
        //paladin.crimeScore(); //throws unsupported operation exception
        paladin.initiateMoralPoints();
        //proved scenario: paladin and rogue have been implemented with unnecessary methods, exceptions thrown
        /*
        Let's consider a Proper Solution for some new classes Mage and Bard
        First, create a common interface "levellingCommon", include common methods used by both classes
        Second, add specific interfaces levellingMage and LevellingBard EXTENDING from levellingCommon
        Finally create classes Mage and Bard IMPLEMENTING levellingXXXXXX
        */
        Bard bard = new Bard();
        bard.learnSong();
        Mage mage = new Mage();
        mage.learnSpell();
        //Proved Scenario: mage does not implemented with unnecessary method learnSong (& vise versa for bard).
        //These new interfaces no longer violate the IS-principle
        System.out.println("-------------------------");

        /*--------------------------------------------------------------------------------------
        5. Dependency Inversion
        https://www.baeldung.com/java-dependency-inversion-principle
        DIP is the practice of modules/files explicitly declaring their dependencies through their APIs.
        High-level modules do not depend on low-level modules. Both depend on abstractions. Abstractions depend on nothing.
        Dependencies refer to "imports", "implements", "extends", Junit5 in a gradle, or when one class instantiates another.
        CORRECT??
        E.g.
        SimpleCustomerDao is a LLM which is  stored in package "Daos", it "implements" interface CustomerDao (dependency)
        CustomerDao is an abstract class which is stored in package "Abstraction" in the api (no dependency)
        CustomerService is a HLM which is stored in package "Services" in the api, it instantiates SimpleCustomerDao (dependency)
        (Also, DIP is neither Dependency Injection nor Inversion of Control.)
        (Also DAO, Data-Access-Object)

        DIP example, includes 5 files:
        Customer, CustomerService, CustomerDao, SimpleCustomerDao, CustomerServiceTest
        Packages: Abstraction, Daos, Entities, Services, Test
        Fetches some customers and processes them in some additional way. Often for databases, here we're using a map.
        Create 5 packages,
        Define class Service, (high level module) - CHOP THIS DOWN
        Define interface DAO, (abstraction)
        Both in the same package, so Service is responsible for DAO abstraction
        Create second package,
        Define class SimpleCustomerDao  (low level module)
        Create Test package
        Define Test CustomerServiceTest
        This shows how to inject the abstraction into the high-level component. WHAT??
        Success: Run the CustomerServiceTest
        Upgrade 1: place Hm, LM and abstraction all in different packages; better for encapsulation, better for DIP
        Upgrade 2: place modules in different packages labelled: services, daos, daoImplementations, entities, mainapp

        Move onto APIE examples, check status of all
        */












    }
}