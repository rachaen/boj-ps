const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let n = 0;
let inputArr = [];

rl.on('line', (line) => {
  if (n === 0) {
    n = parseInt(line);
  } else {
    inputArr = line.split(' ').map(Number);
    rl.close();
  }
}).on('close', () => {
  solution(n, inputArr);
});

/**
 * idx 인덱스에 있는 값이 좋은 수인지 판별하는 함수
 */
function searchCnt(idx, arr) {
  let st = 0; // 왼쪽 포인터
  let ed = arr.length - 1; // 오른쪽 포인터
  const target = arr[idx]; // idx 인텍스에 있는 값을 목표
  while (true) {
    if (st === idx) st++;
    if (ed === idx) ed--;
    if (st >= ed) break;
    const sum = arr[st] + arr[ed];
    if (sum === target) {
      return 1;
    }

    if (sum > target) ed--;
    else st++;
  }
  return 0;
}

function solution(n, arr) {
  if (n <= 2) {
    console.log(0);
    return;
  }
  arr.sort((a, b) => a - b);

  let base = -1000000001;
  let bf = 0;
  let cnt = 0;
  for (let i = 0; i < n; i++) {
    if (base === arr[i]) {
      cnt += bf;
      continue;
    }
    cnt += bf = searchCnt(i, arr);
    base = arr[i];
  }
  console.log(cnt);
}
