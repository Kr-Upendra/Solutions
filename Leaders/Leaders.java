public class Leaders {
  public static void main(String[] args) {
    int[] arr = {14, 17, 2, 4, 5, 2};
    var result = leaders(arr); 
    System.out.println(result);
  }

  public static ArrayList<Integer> leaders(int[] arr) {
    ArrayList<Integer> ans = new ArrayList<>();
    int i = 0;
    while (i < arr.length) {
      if (ans.size() == 0) {
        ans.add(arr[i++]);
      } else {
        if (arr[i] > ans.get(ans.size() - 1)) 
          ans.remove(ans.get(ans.size() - 1));
         else 
          ans.add(arr[i++]);
      }
    }
    return ans;
  }
}
