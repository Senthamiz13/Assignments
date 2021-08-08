let order={
  id:486,
  title:"book",
  price:500,

  printorder : function(){
      return (this.id);
  },

  getPrice : function(){
      return (this.price);
  }

};

let order1 = Object.assign({},order); //Object.assign is used 

console.log(order);
console.log(order1);