package A_Principles_Liskov;

public abstract class Player { //overlying rule is that class must be last word
    double health;
    double power;

    public  Player(double health, double power) { //superclass (parent)
        this.health = health;
        this.power = power;
    }

    public void damage(double decimal){
        health = health - decimal;
    }

    public void heal(double decimal){
        health = health + decimal;
    }

    public void shield(double decimal){
        health = health + decimal;
    }



}
