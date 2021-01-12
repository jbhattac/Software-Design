const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = 
  numbers.filter(e => e % 2 === 0)
    .map(e => e * 2)
    .reduce((total, e) => total + e, 0);

console.log(result);
