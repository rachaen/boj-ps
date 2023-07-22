const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on('line', (line) => {
  if (!line) {
    rl.close();
  }
  input.push(line);
}).on('close', () => {
  solution3(parseInt(input[0], 10), input.slice(1));
});

function solution(length, quizList) {
  quizList.forEach((quizzes) => {
    let score = 0;
    let continuous = 1;
    for (let q of qii)
      quizzes.split('').forEach((quiz) => {
        if (quiz === 'X') {
          continuous = 1;
          return;
        } else {
          score += continuous;
          continuous += 1;
        }
      });
    console.log(score);
  });
}

function solution2(length, quizList) {
  for (let quiz of quizList) {
    let score = 0;
    let continuous = 1;

    for (let q of quiz) {
      if (q === 'X') {
        continuous = 1;
      } else {
        score += continuous;
        continuous += 1;
      }
    }
    console.log(score);
  }
}

function solution3(length, quizList) {
  for (let quiz of quizList) {
    let segments = quiz.split('X');
    let sum = 0;

    for (let segment of segments) {
      for (let k = 1; k <= segment.length; k++) {
        sum += k;
      }
    }

    console.log(sum);
  }
}
