const leaders = (arr, n) => {
  let ans = [];
  let i = 0;
  while (i < n) {
    if (ans.length == 0) {
      ans.push(arr[i++]);
    } else {
      if (arr[i] > ans[ans.length - 1]) {
        ans.pop();
      } else {
        ans.push(arr[i++]);
      }
    }
  }
  console.log(ans);
};

const arr = [16, 17, 4, 3, 5, 2];
const n = arr.length;
leaders(arr, n);
