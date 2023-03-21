public class Master implements Person {
    public Master(int age, String name, int experience ) {
        this.age = age;
        this.name = name;
        this.experience = experience;
    }

    private int age;
    private String name;
    int experience;
    private final String STATUS = "I am a Master";


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
