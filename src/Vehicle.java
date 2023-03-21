public interface Vehicle {

    Person getOwner();
    Person getLastMater();
    void setLastMater(Person person);
    String getType();
    String getModel();
    void setModel(String name);

    int getMileage();
    void setMileage(int distance);

}
