import java.util.HashMap;
import java.util.Set;
public class duplicateCharString {
public static void main(String[]args){
    duplicateCharCount ("Learn Java Programming");
}
public static void duplicateCharCount(String inputSting){
    HashMap<Character, Integer > charCountMap = new HashMap<>();
    char[] strArray = inputSting.toCharArray();
    for(char c : strArray){
        if(charCountMap.containsKey(c)){
            charCountMap.put(c,charCountMap.get(c)+1);
        } else{
            charCountMap.put(c,1);
        }
    }
    Set < Character > charsInString = charCountMap.keySet();
    System.out.println("Duplicate Character in :" + inputSting);
    for (Character ch : charsInString){
        if (charCountMap.get(ch) > 1){
            System.out.println(ch + " : " + charCountMap.get(ch));
        }
    }
}
    
}
