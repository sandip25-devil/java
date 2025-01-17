import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (isPrime(number)) {
            System.out.println(number + "is a prime number");
        }else{
            System.out.println(number  + "is not prime number");
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        } return true;
    }
}
