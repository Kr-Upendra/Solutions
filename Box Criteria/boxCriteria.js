const boxCriteria = (l, b, h, mass) => {
  const ans1 = l >= 1e4 || b >= 1e4 || h >= 1e4 || l * b * h >= 1e9;
  const ans2 = mass >= 100;
  console.log(ans1);
  console.log(ans2);

  if (ans1 && ans2) return "Both";
  if (ans1) return "Bulky";
  if (ans2) return "Heavy";
  else return "Neither";
};

const result = boxCriteria(2909, 3968, 3272, 727);
console.log(result);
