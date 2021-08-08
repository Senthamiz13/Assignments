const compose = (fun1, fun2) => x => fun1(fun2(x));

square = x => x * x;
double = x => 2 * x;
var f1 = compose(
  square,
  double
);
console.log(f1(5));
console.log(f1(10));

var f2 = compose(
  double,
  square
);
console.log(f2(5));
console.log(f2(10));
