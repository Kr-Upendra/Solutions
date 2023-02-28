package FizzBuzz;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n = scan.nextInt();
        var result = solution(n);
        System.out.println(result);
        scan.close();
    }

    public static List<String> solution(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add("" + i + "");
        }
        return result;
    }
}
