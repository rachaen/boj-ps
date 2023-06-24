const fs = require('fs');
const input = fs
  .readFileSync('/dev/stdin', 'utf-8')
  .trim()
  .split('\n')
  .map((line) => line.replace('\r', ''));
input.map((i) => {
  if (i === '0') {
    return;
  }
  const reverse = [...i].reverse().join('');
  reverse === i ? console.log('yes') : console.log('no');
});
