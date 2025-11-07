package Lab2;
import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1-7: ");
        int num = input.nextInt();

        if(num == 1){
            System.out.println("1-Monday");
        }

        else if(num == 2){
            System.out.println("2-Tuesday");
        }

        else if(num == 3){
            System.out.println("3-Wednesday");
        }

        else if(num == 4){
            System.out.println("4-Thursday");
        }

        else if(num == 5){
            System.out.println("5-Friday");
        }

        else if(num == 6){
            System.out.println("6-Sunday");
        }

        else if(num == 7){
            System.out.println("7-Saturday");
        }

        else{
            System.out.println("Invalid Input");
        }
    
        input.close();
    }
}
