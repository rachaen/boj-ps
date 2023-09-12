const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().trim().split('\n');

input.shift();
for (let num of input) {
  num = BigInt(num);
  let flag = true;

  for (let i = 2n; i <= 1000000n; i++) {
    if (num % i === 0n) {
      flag = false;
      break;
    }
  }

  console.log(flag ? 'YES' : 'NO');
}
