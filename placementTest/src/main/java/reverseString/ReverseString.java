package reverseString;

public class ReverseString {

    private static String reverseString(String string) {
        char[] reversedchars = new char[string.length()];
        char[] s = string.toCharArray();
        int index =0;
        for (int i = string.length() - 1; i > 0; i--) {
            reversedchars[index] = s[i];
            index++;
        }
        System.out.println(reversedchars);
        return String.valueOf(reversedchars);
    }

    public static void main(String[] args) {
        String string = "abcdef";
        reverseString(string);
    }
}
