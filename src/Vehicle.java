public class Vehicle {
    public Vehicle(int mileage, int year, String model, boolean isElectric, int enginePower, int lastAutoMaintenanceMilePassed, String lastMaster) {
        this.mileage = mileage;
        this.year = year;
        this.Model = model;
        this.isElectric = isElectric;
        this.enginePower = enginePower;
        this.lastAutoMaintenanceMilePassed = lastAutoMaintenanceMilePassed;
        this.lastMaster = lastMaster;
    }

    int mileage;
    int year;
    String Model;
    boolean isElectric;
    int enginePower;
    int lastAutoMaintenanceMilePassed;
    String lastMaster;
}
