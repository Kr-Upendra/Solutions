public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printSubArrayRec(arr, 0, 0);
    }

    // Brute Force Method
    public static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int sa = i; sa <= j; sa++)
                    System.out.print(arr[sa] + " ");
                System.out.println();
            }
        }
    }

    // Using Recursion
    public static void printSubArrayRec(int[] arr, int start, int end) {
        if (end == arr.length)
            return;
        else if (start > end)
            printSubArrayRec(arr, 0, end + 1);
        else {
            for (int i = start; i <= end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println();
            printSubArrayRec(arr, start + 1, end);
        }
    }
}
