public class ServiceDemo {

    public static void main(String[] args) {


        Person vasya = new Master();
        Person petya = new Client();

        Vehicle kamaz = new Truck();
        Vehicle sedan = new Car();


        MasterService data = new DatabaseServiceImpl();

        data.addPerson(vasya);
        data.addPerson(petya);

        data.addVehicle(kamaz);
        data.addVehicle(sedan);

        data.deletePerson(vasya);
        data.deleteVehicle(kamaz);


    }
}
