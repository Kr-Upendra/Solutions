public class Leaders {
  public static void main(String[] args) {

  }

  public static int[] leaders(int[] arr, int n) {
    ArrayList<Integer> answer = new ArrayList<>();
    int i = 0;
    while (i < n) {
      if (ans.length == 0) {
        answer.add(arr[i++]);
      } else {
        if (arr[i] > answer[answer.length - 1]) 
          answer.pop();
         else 
          answer.add(arr[i++]);
      }
    }
    return answer;
  }
}
