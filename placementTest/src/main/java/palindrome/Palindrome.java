package palindrome;

public class Palindrome {
    private int number;

    public Palindrome(int number) {
        this.number = number;
    }

    public boolean isPalindrome() {
        int reversedNumber = reverseNumber();
        return reversedNumber == number;
    }

    private int reverseNumber() {
        StringBuilder numberBuilder = new StringBuilder();
        int quotient = number;
        int rest = 0;
        if (quotient == 0)
            return 0;
        while(quotient != 0) {
            rest = quotient % 10;
            quotient /= 10;
            numberBuilder.append(rest);
        }
        return Integer.valueOf(numberBuilder.toString());
    }

    public static void main(String[] args) {
        int number = 121;
        Palindrome palindrome = new Palindrome(number);
        if (palindrome.isPalindrome())
            System.out.println(number + " is palindrome");
        else
            System.out.println(number + " is not plindrome");
    }
}
