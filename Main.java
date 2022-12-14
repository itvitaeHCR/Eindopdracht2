import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newNumber = new Scanner(System.in);
        System.out.print("Please provide a whole, positive number: ");
        int number = newNumber.nextInt();
        if (number >= 0) {
            int sumEven = 0;
            int sumOdd = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    sumEven += i;
                } else {
                    sumOdd += i;
                }
            }
            System.out.println("The sum of all even numbers between 1 and " + number + " is: " + sumEven);
            System.out.println("The sum of all odd numbers between 1 and " + number + " is: " + sumOdd);
            System.out.println("The difference between "+ sumEven + " and " + sumOdd + " is: " + (sumEven - sumOdd));

        } else {
            System.out.println("please try again");
        }
    }
}
