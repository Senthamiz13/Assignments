square = x => x * x;

map = function(x, fun) {
  let ar = [];
  for (let i of x) {
    ar.push(fun(i));
  }
  return ar;
};

var array = [1, 3, 5, 4, 2];

console.log('Square of array: ' + map(array, square));
console.log('Square root of array: ' + map([1, 4, 9, 16, 25], Math.sqrt));
