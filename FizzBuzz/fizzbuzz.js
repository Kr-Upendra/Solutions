const fizzBuzz = (n) => {
  let result = [];
  for (let i = 1; i <= n; i++) {
    if (i % 3 === 0 && i % 5 === 0) result.push("FizzBuzz");
    else if (i % 3 === 0) result.push("Fizz");
    else if (i % 5 === 0) result.push("Buzz");
    else result.push(`${i}`);
  }
  console.log(result);
};

fizzBuzz(15);

// flipgrid
// MS fix-a-thon
// ey
// myntra hackerram
// standford charetered
// uber hacktag (Feb/march)
// navi hackerverse (sept)
// servicenow code to win (mar/apr)
// juspay programming challenge (mar/sep)
