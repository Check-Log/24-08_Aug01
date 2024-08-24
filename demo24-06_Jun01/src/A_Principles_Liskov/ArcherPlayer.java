package A_Principles_Liskov;

public /*abstract*/ class ArcherPlayer extends Player{ //WHY CAN'T I MAKE THIS ABSTRACT???

    double power2;
    public ArcherPlayer(double health, double power) { //Subclass (child)
        super(health, power);
        this.power2 = power2;
    }

    @Override
    public void heal(double decimal){
        health = health + decimal;
        System.out.println("ArcherPlayer version of the method ran");
    }

    public void focus(double decimal)
    {
        //power = power + decimal;
        power2 = power2 + decimal;
    }


}
