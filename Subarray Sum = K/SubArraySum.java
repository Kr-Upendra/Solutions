public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        var result = sumOfSubarrays(arr);
        System.out.println(result);

    }

    static int sumOfSubarrays(int[] arr) {
        var sum = 0;
        var temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                sum += temp;
            }
        }
        return sum;
    }
}
