package displaySomething;

public class display {
    private static final String x = "|X|";
    private static final String empty = "| |";
    private static final String coin = "|O|";
    private static final String space = "\n";

    public static String displayThis(String... someThings) {
        StringBuilder builder = new StringBuilder();
        int index = 1;
        for (String item : someThings) {
            builder.append(item);
            if (index == 3) {
                builder.append(space);
                index = 1;
            } else {
                index++;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(displayThis(coin, coin, x, coin, x, x, x, empty, coin));
    }
}
