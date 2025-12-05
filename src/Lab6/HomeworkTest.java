package Lab6;

import java.util.Calendar;
import java.util.Date;

public class HomeworkTest {
    public static void main(String[] args) {
        Date now = new Date();
        Homework hw1 = new Homework("SENG-211", "Object Oriented Programming", now);

        hw1.printInfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.DECEMBER, 18, 23, 59);
        Date deadline = cal.getTime();
        
        Homework hw2 = new Homework("CENG-201", "Data Structures and Algorithms", deadline);
        hw2.printInfo();
    }
}
