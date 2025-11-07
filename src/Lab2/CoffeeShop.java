package Lab2;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an item from the menu:");
        System.out.println("A -> Americano \nC -> Cappucino \nL -> Latte \nE -> Espresso");
        String item = input.next();
        char choice = item.charAt(0);

        switch(choice){
            case 'A':
                System.out.println("$3.00");
                break;
            case 'C':
                System.out.println("$3.75");
                break;
            case 'L':
                System.out.println("$4.00");
                break;
            case 'E':
                System.out.println("$2.50");
                break;
        }

        input.close();
    }
}
