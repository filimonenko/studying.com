public class Vehicle {
    public Vehicle(int mileage, int year, String model, boolean isElectric, int enginePower, int lastAutoMaintenanceMilePassed, Master lastCheckedMaster) {
        this.mileage = mileage;
        this.year = year;
        this.Model = model;
        this.isElectric = isElectric;
        this.enginePower = enginePower;
        this.lastAutoMaintenanceMilePassed = lastAutoMaintenanceMilePassed;
        this.lastCheckedMaster = lastCheckedMaster;
    }

    int mileage;
    int year;
    String Model;
    boolean isElectric;
    int enginePower;
    int lastAutoMaintenanceMilePassed;
    Master lastCheckedMaster;

}
