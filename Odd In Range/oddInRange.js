const findOdds = (low, high) => {
  let count = 0;
  for (let i = low; i <= high; i++) if (i % 2 != 0) count++;
  return count;
};

const findOdds2 = (low, high) => {
  let total = high - low + 1;
  if (total % 2 == 0) return Math.floor(total / 2);
  else if (low % 2 != 0) return Math.floor(total / 2 + 1);
  else return Math.floor(total / 2);
};

const result = findOdds2(3, 7);
console.log(result);
