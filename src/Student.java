public class Student {
    String name;
    int age;
    boolean isJunior;
    char gender;

    public Student() {
        name = " ";
        age = 0;
        isJunior = false;
        gender = ' ';
    }

    public Student(String name, int age, boolean isJunior, char gender) {
        this.name = name;
        this.age = age;
        this.isJunior = isJunior;
        this.gender = gender; 
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Junior: " + isJunior);
        System.out.println("Gender: " + gender);
    }
}
