public class Client  implements Person{
    public Client(int age, String name, Vehicle vehicle ) {
        this.age = age;
        this.name = name;
        this.vehicle = vehicle;

    }

    private final String STATUS = "I am a Client";
    private int age;
    private String name;
    Vehicle vehicle;


    @Override
    public String getStatus() {
        return STATUS;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
