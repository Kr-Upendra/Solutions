public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        var result = containsDuplicate2(nums, k);
        System.out.println(result);
    }

    public static boolean containsDuplicate2(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                var absValue = Math.abs(i - j);
                if (arr[i] == arr[j] && absValue <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}