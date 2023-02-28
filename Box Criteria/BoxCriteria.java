import java.util.*;

public class BoxCriteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();
        int mass = scan.nextInt();
        var result = solution(length, width, height, mass);
        System.out.println(result);
        scan.close();
    }

    public static String solution(int length, int width, int height, int mass) {
        var ans1 = length >= 1e4 || width >= 1e4 || height >= 1e4 || length * width * height >= 1e9;
        var ans2 = mass >= 100;
        if (ans1 && ans2)
            return "Both";
        if (ans1)
            return "Bulky";
        if (ans2)
            return "Heavy";
        else
            return "Neither";
    }
}
