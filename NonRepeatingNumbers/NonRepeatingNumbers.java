// Problem Source: https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1

package NonRepeatingNumbers;

import java.util.*;

public class NonRepeatingNumbers {

  // Approach 1
  private static int[] nonRepeatingNumbers(int[] arr) {
    ArrayList<Integer> preAnswer = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num))
        map.put(num, map.get(num) + 1);
      else
        map.put(num, 1);
    }

    for (int key : map.keySet()) {
      if (map.get(key) == 1)
        preAnswer.add(key);
    }

    int[] finalResult = new int[preAnswer.size()];
    for (int i = 0; i < preAnswer.size(); i++) {
      finalResult[i] = preAnswer.get(i);
    }

    Arrays.sort(finalResult);
    return finalResult;
  }

  // Approach 2
  static int[] nonRepeatingNumbers2(int[] arr) {
    Arrays.sort(arr);
    int sIndex = -1, eIndex = -1;
    ArrayList<Integer> sArr = new ArrayList<>();
    ArrayList<Integer> eArr = new ArrayList<>();

    for (int i = 0; i < arr.length - 1; i += 2) {
      if (arr[i] != arr[i + 1]) {
        sArr.add(arr[i]);
        eArr.add(arr[i + 1]);
      }
    }

    sIndex = sArr.get(0);
    eIndex = eArr.get(eArr.size() - 1);
    int[] finalResult = { sIndex, eIndex };
    return finalResult;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 1, 2 };
    int[] result1 = nonRepeatingNumbers(arr);
    System.out.println(Arrays.toString(result1));

    int[] result2 = nonRepeatingNumbers(arr);
    System.out.println(Arrays.toString(result2));

  }

}
