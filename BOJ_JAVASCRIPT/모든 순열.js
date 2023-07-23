'use strict';

let fs = require('fs');
let input = fs.readFileSync('./input.txt').toString().split(' ');

let N = Number(input[0]);

let arr = [];

for (let i = 1; i <= N; i++) {
  arr.push(i);
}

let permArr = getPermutations(arr, N);

permArr.forEach((perm) => {
  console.log(perm.join(' '));
});

/** 재귀 */
function getPermutations(arr, selectNumber) {
  const result = [];

  if (selectNumber === 1) return arr.map((el) => [el]);

  arr.forEach((fixed, index, origin) => {
    const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];

    const permutations = getPermutations(rest, selectNumber - 1);

    const attached = permutations.map((el) => [fixed, ...el]);

    result.push(...attached);
  });

  return result;
}

/** 방문 기록 배열을 활용한 깊이 우선 탐색 */
function getPermutations2(arr, selectedNumber) {
  const result = [];
  const path = [];
  const visited = Array(selectedNumber).fill(false);

  function dfs(depth) {
    if (depth === N) {
      result.push([...path]);
      return;
    }

    for (let i = 0; i < arr.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        path.push(arr[i]);

        dfs(depth + 1);

        path.pop();
        visited[i] = false;
      }
    }
  }
  dfs(0);
  return result;
}
