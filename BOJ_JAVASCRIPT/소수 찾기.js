const fs = require('fs');
const [n, input] = fs.readFileSync('/dev/stdin', 'utf-8').trim().split('\n');
const inputArr = input.split(' ').map(Number);

let answer = 0;
inputArr.forEach((i) => {
  if (i === 1) return;

  let isPrime = true;
  for (let j = 2; j <= Math.sqrt(i); j++) {
    if (i % j === 0) {
      isPrime = false;
      break;
    }
  }

  if (isPrime) answer++;
});

console.log(answer);
