public class Car extends Vehicle{

    private int numberOfSeats;
    private final String TYPE = "I am a Car";

    public Car() {
        super();
    }
    public Car(int id, int mileage, int year, String model, String typeOfEngine, Client owner, Master lastCheckedMaster) {
        super(id, mileage, year, model, typeOfEngine, owner, lastCheckedMaster);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTYPE() {
        return TYPE;
    }
}
