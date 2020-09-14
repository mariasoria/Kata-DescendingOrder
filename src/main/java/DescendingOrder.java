import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        Object [] numberObject = Integer.toString(num).split("");

        String descendingNumberString = "";
        Arrays.sort(numberObject, 0, numberObject.length);
        for (Object number : numberObject) {
            descendingNumberString = number + descendingNumberString;
        }
        int descendingNumber = Integer.valueOf(descendingNumberString);
        return descendingNumber;
    }
}
