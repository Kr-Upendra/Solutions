const reduceToZero = (num) => {
  let count = 0;
  while (num !== 0) {
    if (num % 2 == 0) {
      num /= 2;
    } else {
      num -= 1;
    }
    count++;
  }
  console.log(count);
};

reduceToZero(14);
reduceToZero(8);
reduceToZero(123);
