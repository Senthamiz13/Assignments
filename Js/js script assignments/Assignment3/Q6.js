//Defining a object with 2 property using eval function with a string having object definition
var objectStr = '( { firstName : "Sen", lastName : "Thamiz" } )';

const person1=eval(objectStr);

//Accessing a undefined properties
console.log("Name : "+person1.firstName+" "+person1.middleName+" "+person1.lastName);

person1.middleName="Kumar";

//Accessing after defining properties
console.log("Name : "+person1.firstName+" "+person1.middleName+" "+person1.lastName);
