let currentNo=Symbol("currentNo");
class Fibanocci {
    
    [currentNo];
     constructor(current: number){
        this[currentNo] = current;
    }

    next(){
        return fibanocci(this[currentNo]); 
    }
}

function fibanocci(n: number) {
    {
        let result = n * (1 + Math.sqrt(5)) / 2.0;
        return Math.round(result);
    }
};
let fib = new Fibanocci(8);
console.log(fib.next());