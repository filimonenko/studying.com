public class Person {

    private int id;
    private String name;

    public Person() {

    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }
    void setId(int id){
        this.id = id;
    }

}