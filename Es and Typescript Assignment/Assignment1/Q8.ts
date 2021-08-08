var Balance = new Array();

class Account{
  constructor(id, name, balance){
      this.id = id;
      this.name = name;
      this.balance = balance;
  }

  Balance(){
      return this.balance;
  }
} 

class SavingAccount extends Account{
  constructor(id, name, balance, interest){
      super(id, name, balance = balance + (balance*interest)/100);
      Balance.push(balance);
  }
}

class CurrentAccount extends Account{
  constructor(id, name, balance, cash_credit){
      super(id, name, balance = balance + cash_credit);
      Balance.push(balance);
  }
}

var TotalBalance = function(arr){
  return arr.reduce(function(a,b){
    return a + b
  }, 0);
}


let savingAccount = new SavingAccount(11717121, "Sen", 10000, 10);
let currentAccount = new CurrentAccount(11717122, "Aki", 14000, 20);
let savingAccount1 = new SavingAccount(11717198, "Sen", 10536, 10);
let currentAccount1 = new CurrentAccount(11717128, "Aki", 57220, 20);



//console.log(savingAccount.Balance());
//console.log(currentAccount.Balance());

console.log(Balance);

console.log(TotalBalance(Balance));