import java.util.Scanner;

public class SwapTwoNumber {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the first number: ");
                int a = 5;
                System.out.println("Enter the second number: ");
                int b = 10;
                System.out.println("Before swapping: a =" + a +",b ="+b);

                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("After swapping: a =" + a +",b ="+b);
            }
    }

