const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
  if (input.length === 4) {
    rl.close();
  }
}).on('close', () => {
  const N = parseInt(input[0]);
  const arr = input[1]
    .split(' ')
    .map((x) => parseInt(x))
    .sort((a, b) => a - b);
  const M = parseInt(input[2]);
  const searchValues = input[3].split(' ').map((x) => parseInt(x));
  let result = '';
  for (let i = 0; i < M; i++) {
    if (binarySearch(arr, searchValues[i]) >= 0) {
      result += '1\n';
    } else {
      result += '0\n';
    }
  }
  console.log(result);
});

/**
 * 이진탐색
 */
function binarySearch(arr, key) {
  let st = 0;
  let ed = arr.length - 1;

  while (st <= ed) {
    let mid = Math.floor((st + ed) / 2);

    if (key < arr[mid]) {
      ed = mid - 1;
    } else if (key > arr[mid]) {
      st = mid + 1;
    } else {
      return mid;
    }
  }

  return -1;
}
