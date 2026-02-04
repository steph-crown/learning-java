public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.setName(name);
        this.setAge(0);
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

