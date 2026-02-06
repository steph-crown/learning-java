public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
        this.name = "Unknown";
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    @Override()
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + " years";
    }
}

