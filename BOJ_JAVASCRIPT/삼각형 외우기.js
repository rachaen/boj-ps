const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputAngles = [];

rl.on('line', (line) => {
  inputAngles.push(Number(line));
  
  if (inputAngles.length === 3) {
    rl.close();
  }
}).on('close', () => {
  classifyTriangle(inputAngles);
});

function classifyTriangle(angles) {
  const totalAngle = angles.reduce((sum, angle) => sum + angle, 0);

  if (totalAngle !== 180) {
    console.log('Error');
    return;
  }

  if (isEquilateral(angles)) {
    console.log('Equilateral');
  } else if (isIsosceles(angles)) {
    console.log('Isosceles');
  } else {
    console.log('Scalene');
  }
}

function isEquilateral(angles) {
  return angles.every(angle => angle === 60);
}

function isIsosceles(angles) {
  return angles.some((angle, index) => angles.indexOf(angle) !== index);
}
