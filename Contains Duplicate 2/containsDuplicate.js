const containsDuplicate2 = (nums, k) => {
  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      let absValue = Math.abs(i - j);
      if (nums[i] === nums[j] && absValue <= k) return true;
    }
  }
  return false;
};

const nums = [1, 2, 3, 1, 2, 3];
const k = 2;
const result = containsDuplicate2(nums, k);
console.log(result);
