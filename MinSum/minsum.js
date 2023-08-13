/*
 * Problem statement: Given a matrix of m rows and n columns. You need to find minimum of each rows and return the sum of those elements
 */

const findMinFromEachRow = (matrix) => {
  const minElements = [];
  for (let i = 0; i < matrix.length; i++) {
    let minValue = Number.MAX_VALUE;
    for (let j = 0; j < matrix[i].length; j++)
      if (matrix[i][j] < minValue) minValue = matrix[i][j];
    minElements.push(minValue);
  }

  let sumValue = 0;
  for (const el of minElements) sumValue += el;
  return sumValue;
};

const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
const minsum = findMinFromEachRow(matrix);
console.log(minsum); // Output: 12
