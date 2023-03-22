public class Master extends Person {

    private int age;
    private int experience;
    private int salary ;
    private final String STATUS = "I am a Master";

    public Master() {
        super();
    }
    public Master(int id, String name, int age, int experience, int salary) {
        super(id, name);
        this.age = age;
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSTATUS() {
        return STATUS;
    }
}
