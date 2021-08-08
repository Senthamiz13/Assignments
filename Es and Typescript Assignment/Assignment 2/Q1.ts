const previousFiboNo = Symbol('previousfibo');
const range = Symbol('range');

class MyClass {
  private previousFiboNo: number;
  private range: number;

  constructor(input: number) {
    this.previousFiboNo = fibo(input - 1);
    this.range = input;
  }
  next() {
    return fibo(this.range + 1);
  }
}
var fibo = function(n: number) {
  var a = 0,
    b = 1,
    f = 1;
  for (var i = 2; i <= n; i++) {
    f = a + b;
    a = b;
    b = f;
  }
  return f;
};

let myClass = new MyClass(8);
console.log(myClass);
console.log(myClass.next());

console.log(typeof previousFiboNo);
