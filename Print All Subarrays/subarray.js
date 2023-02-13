const printSubArray = (arr) => {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i; j < arr.length; j++) {
      for (let k = i; k <= j; k++) {
        console.log(arr[k]);
      }
      //   console.log("\n");
    }
  }
};

const printSubArrayUsingRecursion = (arr, start, end) => {
  const arrayLength = arr.length;
  if (end === arrayLength) return;
  else if (start > end) printSubArrayUsingRecursion(arr, 0, end + 1);
  else {
    for (let i = start; i <= end; i++) console.log(arr[i] + ", ");
    printSubArrayUsingRecursion(arr, start + 1, end);
  }
};

const nums = [1, 2, 3, 4];
console.log("Brute Force method");
printSubArray(nums);
console.log("using recursion");
printSubArrayUsingRecursion(nums, 0, 0);
