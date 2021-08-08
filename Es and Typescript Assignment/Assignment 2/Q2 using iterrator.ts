console.log("------------------");
function makeRangeIterator(start = 11, end = Infinity, step = 1) {
  let nextIndex = start;
  let iterationCount = 0;
  let i;
  const rangeIterator = {
     next: function() {
         let result;
         if (nextIndex < end) {

          ////////// Armstrong number //////
          for (i = nextIndex; i > 10; i++) {
            let numberOfDigits = i.toString().length;
            let sum = 0;
            let temp = i.toString();
            for (let char of temp) {
              sum += Math.pow(parseInt(char), numberOfDigits);
            }
            if (sum == i) {
              //console.log(i);
              nextIndex = i;
              break;
            }
          }
          /////////////Armstrong number end ///////////
          
             result = {value: i, done: false}
             nextIndex += step;
             iterationCount++;
             return result;
         }
         return {value: iterationCount, done: true }
     }
  };
  return rangeIterator;
}
const it = makeRangeIterator();

console.log(it.next());
console.log(it.next());
console.log(it.next());
