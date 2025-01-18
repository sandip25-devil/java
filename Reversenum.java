import java.util.Scanner;

public class Reversenum {
    public static void main(String[]args){
        int no, rev= 0, r, a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        no = scan.nextInt();
        a = no;
        while(no > 0){
            r = no % 10;
            rev = rev*10+r;
            no = no / 10;
        }
        System.out.println("Reverse: "+rev);
    }
    
}
