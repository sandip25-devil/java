import java.util.Scanner;
public class reverseString {
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String input = scan.nextLine();
            char ch;
            String str = "";
            for (int i = 0; i < input.length();i++){
                ch = input.charAt(i);
                str = ch + str;
            }
            System.out.println("Reversed String is: " + str);
        
    }
    
}
