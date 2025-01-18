public class sumdigit {
    public static void main(String[]args){
        int number = 12345;
        int sumdigit = calculateSumdigit(number);
        System.out.println("sum of digits of"+ number + "is:" + sumdigit);
    }
    public static int calculateSumdigit(int number){
        int sum = 0;
        while(number > 0){
            int digit = number % 10 ;
            sum = sum + digit;
            number = number / 10;

        }
        return sum;
    }
    
}
