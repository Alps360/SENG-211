package Lab5;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("Dua Lipa","Los Angeles" );
        System.out.println(stu1.toString());
        
        stu1.setAdress("Vegas");
        System.out.println(stu1.toString());

        System.out.println(stu1.getName());
        System.out.println(stu1.getAdress());
        
        stu1.addCourseGrade("SENG211", 70);
        stu1.addCourseGrade("CENG201", 43);
        stu1.addCourseGrade("CENG205", 88);

        stu1.printGrades();

        System.out.println("The average grade is " + stu1.getAverageGrade());
    }
}
