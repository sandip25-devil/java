import java.util.Scanner;
public class PrintUnqiueChar {
public static void main(String [] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter a String : ");
    String input = scanner.nextLine();
    System.out.println("Unique character in \"" + input + "\":");
    PrintUnqiueChar(input);
}
public static void PrintUnqiueChar(String str){
    boolean[] Unique = new boolean[128];
    for(int i = 0; i < str.length();i++){
        char ch = str.charAt(i);
        if(!Unique[ch]){
            Unique[ch] = true;
            System.out.println(ch + " ");
        }
    }
}
    
}
