public class Truck implements Vehicle {
    public Truck(int mileage, int year, String model,  int enginePower, Person owner, Person lastCheckedMaster) {
        this.mileage = mileage;
        this.year = year;
        this.model = model;
        this.enginePower = enginePower;
        this.lastCheckedMaster = lastCheckedMaster;
        this.owner = owner;
    }

    private final String TYPE = "I am a Truck";
    int mileage;
    int year;
    String model;
    int enginePower;
    Person owner;
    Person lastCheckedMaster;

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public Person getOwner() {
        return owner;
    }

    @Override
    public Person getLastMater() {
        return lastCheckedMaster;
    }

    @Override
    public void setLastMater(Person person) {
        this.lastCheckedMaster = person;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public void setMileage(int distance) {
        this.mileage = distance;
    }
}
