let leastNumber = 10;

console.log("Armstrong Numbers:");
function armstong() {
  for (let i = leastNumber; i > 10; i++) {
    let numberOfDigits = i.toString().length;
    let sum = 0;
    let temp = i.toString();
    for (let char of temp) {
      sum += Math.pow(parseInt(char), numberOfDigits);
    }
    if (sum == i) {
      console.log(i);
      leastNumber = i;
      break;
    }
  }
}

function getNextArmstrong() {
  leastNumber++;
  armstong();
}

armstong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
