import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num < 0) {
            throw new RuntimeException("Number must be positive");
        }
        char[] charArray = String.valueOf(num).toCharArray();
        Arrays.sort(charArray);
        StringBuilder stringBuilder = new StringBuilder(new String(charArray));
        return Integer.parseInt(stringBuilder.reverse().toString());
    }
}
