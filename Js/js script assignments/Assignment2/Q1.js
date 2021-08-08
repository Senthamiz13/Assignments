square = x => x*x;
double = x => 2*x;
const composedValue= (fun1,fun2) =>(x) => fun1(fun2(x));
console.log(composedValue(square,double)(5));
