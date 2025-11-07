package Lab3;
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        s1.age = 15;
        s1.name = "Ayşe";
        s1.isJunior = true;
        s1.gender = 'f';

        s1.info();
    }
}
