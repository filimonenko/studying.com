public class Truck extends Vehicle {

    private int loadCapacity;
    private int enginePower;
    private final String TYPE = "I am a Truck";

    public Truck() {
        super();
    }

    public Truck(int id, int mileage, int year, String model, String typeOfEngine, Client owner, Master lastCheckedMaster, int loadCapacity, int enginePower) {
        super(id, mileage, year, model, typeOfEngine, owner, lastCheckedMaster);
        this.loadCapacity = loadCapacity;
        this.enginePower = enginePower;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTYPE() {
        return TYPE;
    }
}
