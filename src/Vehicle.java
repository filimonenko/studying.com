public class Vehicle {

    private int id;
    private int mileage;
    private int year;
    private String model;
    private String typeOfEngine;
    private Client owner;
    private Master lastCheckedMaster;

    public Vehicle() {
    }

    public Vehicle(int id, int mileage, int year, String model, String typeOfEngine, Client owner, Master lastCheckedMaster) {
        this.id = id;
        this.mileage = mileage;
        this.year = year;
        this.model = model;
        this.typeOfEngine = typeOfEngine;
        this.owner = owner;
        this.lastCheckedMaster = lastCheckedMaster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Master getLastCheckedMaster() {
        return lastCheckedMaster;
    }

    public void setLastCheckedMaster(Master lastCheckedMaster) {
        this.lastCheckedMaster = lastCheckedMaster;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
}
