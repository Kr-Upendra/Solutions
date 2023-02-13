const containsDuplicate = (nums) => {
  sortArray(nums);
  for (let i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) return true;
  }
  return false;
};

const sortArray = (list) => {
  for (let i = 0; i < list.length - 1; i++) {
    for (let j = 0; j < list.length - i - 1; j++) {
      if (list[j] > list[j + 1]) {
        let temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
      }
    }
  }
};

const nums = [1, 2, 3, 4];
const result = containsDuplicate(nums);
console.log(result);
