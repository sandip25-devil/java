import java.util.Scanner;
public class EvenIndexChar {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String :");
    String input = scanner.nextLine();
    System.out.println("Even indexed char in \"" + input + "\":");
    EvenIndexChar(input);
}
public static void EvenIndexChar(String str){
    for (int i = 0; i < str.length(); i++){
        if (i % 2 == 0) {
            System.out.println(str.charAt(i));
        }
    }
}
    
}
