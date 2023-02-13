import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        var result = containsDuplicate(arr);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (var i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
