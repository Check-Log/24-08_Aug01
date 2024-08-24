package A_Principles;

public class LaserCannon {
    private double airLevel;
    private double laserBattery;
    private double thrusterBattery;
    private double remainingDiveTime;

    public LaserCannon(){
        
    }

    double getLaserBattery(){
        airLevel = 100;
        return airLevel;
    }
    
    double getThrusterBattery(){
        thrusterBattery = 400;
        return thrusterBattery;
    }

    public void printRemainingLaserBattery(){
        System.out.println("Remaining laser battery: " + getLaserBattery());
    }

    public void printRemainingThrusterBattery(){
        System.out.println("Remaining thruster battery: " + getThrusterBattery());
    }

    //functional, but this violates SRP. The class contains at least 3 responsibilities,
    //manipulating air level, manipulating dive time, and printing dive time.
    //instead we should have 3 classes called: AirLevelCounter, DiveTimeCounter, DiveTimePrinter
}