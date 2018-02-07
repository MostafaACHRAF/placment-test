package SortArray;

public class Sort {

    private static int[] sortNumbers(int[] numbers) {
        int first;
        int seconde;
        int temporary;
        boolean notSorted = true;
        while (notSorted) {
            for (int i = 0; i < numbers.length; i++) {
                notSorted = false;
                first = numbers[i];
                if (i < numbers.length - 1)
                    seconde = numbers[i + 1];
                else
                    seconde = first;
                if (first > seconde) {
                    System.out.println(first + " " + seconde);
                    temporary = first;
                    first = seconde;
                    seconde = temporary;
                    notSorted = true;
                    numbers[i] = first;
                    numbers[i + 1] = seconde;
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2};
        int[] results = sortNumbers(numbers);

        for (Integer number : results) {
            System.out.println(number);
        }

    }
}
