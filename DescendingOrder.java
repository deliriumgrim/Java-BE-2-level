import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        Arrays.sort(charArray);
        StringBuilder stringBuilder = new StringBuilder(new String(charArray));
        return Integer.parseInt(stringBuilder.reverse().toString());
    }
}
