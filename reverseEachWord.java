class reverseEachString {
    public static void main(String[] args) {
        reverseEachString("Java is good programming langauges");
    }

    static void reverseEachString(String inputSting) {
        String[] words = inputSting.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String str = " ";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                str = ch + str;
            }
            reverseString = reverseString + str + " ";
        }
        System.out.println(inputSting);
        System.out.println(reverseString);
    }
}


