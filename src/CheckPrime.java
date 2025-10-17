import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner("System.in");

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        for(int i = 0; i < num / 2; i++){
            if(num % i == 0){
                System.out.println("The " + num + " is a prime number");
            }
            else{
                System.out.println("The number is not Prime");
            }
        }

        input.close();
    }
}

