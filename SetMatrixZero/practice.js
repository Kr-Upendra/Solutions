const markRowZero = (matrix, i) => {
  for (let j = 0; j < matrix.length; j++) {
    if (matrix[i][j] !== 0) matrix[i][j] = -1;
  }
};

const markColsZero = (matrix, j) => {
  for (let i = 0; i < matrix.length; i++) {
    if (matrix[i][j] != 0) matrix[i][j] = -1;
  }
};

const printMatrix = (matrix) => {
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      console.log(matrix[i][j] + " ");
    }
  }
};

const setMatrixZero = (matrix) => {
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      if (matrix[i][j] === 0) {
        markRowZero(matrix, i);
        markColsZero(matrix, j);
      }
    }
  }

  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      if (matrix[i][j] === -1) {
        matrix[i][j] = 0;
      }
    }
  }
  return matrix;
};

const matrix = [[0, 1]];

const resultMatrix = setMatrixZero(matrix);
printMatrix(resultMatrix);
