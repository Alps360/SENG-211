import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } 
        
        else {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(num);
            for (int i = 2; i <= limit; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        input.close();
    }
}

