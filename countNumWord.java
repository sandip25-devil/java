import java.util.Scanner;
public class countNumWord {
    public static void main(String []args){
        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);
        String sc =  scan.nextLine();
        int count = 1;

        for(int i = 0; i < sc.length() -1 ;i++){
            if((sc.charAt(i) == ' ') && (sc.charAt(i+1) !=' ')){
                count++;
            }
        }
        System.out.println("Number of the Words in a String:" +count);
    }
    
}
