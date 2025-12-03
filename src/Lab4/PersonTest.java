package Lab4;

public class PersonTest {
    public static void main(String[] args) {
        Person per1 = new Person();

        per1.setName("Selim");
        per1.setAge(16);

        System.out.println("Person Name: " + per1.getName() + ", Person Age: " + per1.getAge() + ", Person Id: " + per1.getId());

    }
}
