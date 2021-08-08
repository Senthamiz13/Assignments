function isEven(num) {return(num%2 == 0); }

console.log(isEven(3));
console.log(isEven(4));


function find(x, fun) {
  if (x.length == 0) {
    return -1;
  }
  if (fun(x[0])) return x[0];
  else {
    return find(x.slice(1), fun);
  }
}
console.log(find([1, 3, 5, 4, 2], isEven));
