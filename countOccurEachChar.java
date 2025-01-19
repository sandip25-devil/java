import java.util.HashMap;
public class countOccurEachChar {
public static void main(String [] args){
    CharCount("Test Automation Java Automation");
}
static void CharCount(String inputString){
    HashMap < String, Integer > charCountMap = new HashMap <>();
    for (String s : inputString.split(" ")){
        if(charCountMap.containsKey(s)){
            charCountMap.put(s,charCountMap.get(s)+1);
        }else{
            charCountMap.put(s,1);
        }
    }
    System.out.println("Count of characters in a given string :" + charCountMap);
}
}
