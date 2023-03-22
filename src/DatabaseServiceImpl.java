import java.util.*;


public class DatabaseServiceImpl implements MasterService  {

    Map<Integer, Vehicle> listOfVehicle = new HashMap<>();

    Map<Integer, Person> listOfPerson = new HashMap<>();



    @Override
    public void addPerson(Person person) {
        listOfPerson.put(person.getId(),person);
    }

    @Override
    public void deletePerson(Person person) {
        listOfPerson.remove(person.getId());
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        listOfVehicle.put(vehicle.getId(), vehicle);
    }

    @Override
    public void deleteVehicle(Vehicle vehicle) {
        listOfVehicle.remove(vehicle.getId());
    }
}