import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if(isPalindrome(number)){
            System.out.println(number+ "is a palindrome");
        }
        else{
            System.out.println(number+ " is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        int originalNumber = num;
        int reverseNumber = 0;

        while (num !=0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        }
        return originalNumber == reverseNumber;
    }
    
}
