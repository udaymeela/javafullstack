// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {
    public String name;
    public Student(String name) {
        super();
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Uday");
        String nameToPrint = student1.getName();
        System.out.println(nameToPrint);
        student1.setName("Uddeesh");
        System.out.println(student1.name);

    }
}
