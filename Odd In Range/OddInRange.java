public class OddInRange {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        var result = findOdds(low, high);
        System.out.println(result);

    }

    // Brute Force Approach
    public static int findOdds(int low, int high) {
        var count = 0;
        for (int i = low; i <= high; i++) 
            if (i % 2 != 0) count++;
        return count;
    }

    // Optimized Version
    public static int findOdds2(int low, int high) {
        var total = high - low + 1;
        if (total % 2 == 0)
            return total / 2;
        else if (low % 2 != 0)
            return total / 2 + 1;
        else
            return total / 2;
    }
}
