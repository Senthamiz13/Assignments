//conditional function to check even
function isEven(num) {
  return num % 2 == 0;
}

console.log(isEven(3));
console.log(isEven(4));


// find takes x : array and fun : conditional function as argument.
find = function(x, fun) {
  for (let i of x) {
    if (fun(i)) {
      return i;
    }
  }
};
console.log(find([1, 3, 5, 4, 2], isEven));
