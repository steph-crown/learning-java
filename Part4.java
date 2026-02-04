void main() {
    Student student = new Student();
    student.play();
    System.out.println(student.credits);

    Person person = new Person("ridicule");
    person.setAge(8390);

    System.out.println(person);
}

public static class Student {

    private int credits;

    public Student() {
        this.credits = 0;
    }

    public void play() {
        this.credits = this.credits - 8;
    }
}
