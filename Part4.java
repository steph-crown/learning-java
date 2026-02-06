void main() {
    Student student = new Student();
    student.play();
    System.out.println(student.credits);

    Person person = new Person("ridicule");
    person.setAge(8390);

    System.out.println(person);

//    Scanner scanner = new Scanner(System.in);
//    while (scanner.hasNextLine()) {
//        String input = scanner.nextLine(); // This "consumes" the line
//        System.out.println("Echo: " + input);
//    }

//    files
    try (Scanner scanner = new Scanner(Paths.get("Readme.md"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("line " + line);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
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