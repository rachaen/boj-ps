const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const N = +input[0];
const str = input[1];

console.log(solution());

function solution() {
  let hash = 0;
  let r = 1;
  const M = 1234567891;

  for (let i = 0; i < N; i++) {
    hash += (str[i].charCodeAt() - 'a'.charCodeAt() + 1) * r;
    r *= 31;
    r %= M;
    hash %= M;
  }

  return hash;
}
