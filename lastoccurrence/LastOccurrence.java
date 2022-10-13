package lastoccurrence;

public class LastOccurrence {
    public static void main(String[] args) {
        String string = "qwerasdfzxgqwetrewdgqwer";
        String subS = "qwer";
        System.out.println(lastStringOccurrence(string, subS));
    }

    public static Integer lastStringOccurrence(String string, String subString) {
        char[] chars = string.toCharArray();
        char[] subChars = subString.toCharArray();
        boolean flag = true;
        int result = 0;
        int i = 0;
        int j = 0;
        while (flag) {
            if (i == chars.length) {
                flag = false;
            } else if (j == subChars.length) {
                j = 0;
            } else if (chars[i] == subChars[j] && j == 0) {
                result = i;
                j++;
            } else if (chars[i] == subChars[j]) {
                j++;
            }
            i++;
        }
        return result;
    }
}
