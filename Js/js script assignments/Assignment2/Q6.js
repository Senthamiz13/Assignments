square = x => x * x;

function map(x, fun) {
  if (x.length == 0) {
    var ar = [];
    //console.log("x is empty");
    return ar;
  } 
  else {
    var ar = map(x.slice(1), fun); //slices the first element of array
    //console.log(".")
    ar.unshift(fun(x[0])); //adds new element ro the front of thearry
    //console.log("..")
    return ar;
  }
}

console.log(map([1, 2, 3, 4, 5], square));

console.log(map([1, 4, 9, 16, 25], Math.sqrt));
