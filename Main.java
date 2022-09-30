
/**
 * rotate image 90 degree
 * make image black and white
 * find index of the last occurrence in a given string
 * text justification to left giving max width of line, split word with "-" in case a word is too long
*/
public class Main {
    public static void main(String[] args) {
        String s = "ABDEFaGABEF";
        System.out.println(s);
        System.out.println(longestUniqueSubstring(s));
    }

    public static String longestUniqueSubstring(String str) {
        String test = "";
        String result = "";
        int maxLength = -1;

        if (str.isEmpty()) {
            throw new IllegalArgumentException("string cannot be empty");
        } else if (str.length() == 1) {
            return str;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + String.valueOf(c);
            if (maxLength < test.length()) {
                result = test;
                maxLength = test.length();
            }
        }
        return result;
    }

}