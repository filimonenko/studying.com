public class Client extends Person {

    private int yearsWithCompany;
    private Vehicle vehicle;
    private final String STATUS = "I am a Client";

    public Client(){
        super();
    }
    public Client(int id, String name, int yearsWithCompany, Vehicle vehicle) {
        super(id, name);
        this.yearsWithCompany = yearsWithCompany;
        this.vehicle = vehicle;
    }

    public int getYearsWithCompany() {
        return yearsWithCompany;
    }

    public void setYearsWithCompany(int yearsWithCompany) {
        this.yearsWithCompany = yearsWithCompany;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getSTATUS() {
        return STATUS;
    }
}
