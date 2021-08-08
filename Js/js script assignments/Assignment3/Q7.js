//Defining a object with 2 property using JSON parse
const person1 = JSON.parse('{"firstName" : "Sen", "lastName" : "Thamiz"}');

//Accessing a undefined properties
console.log('Middle Name : ' + person1.middleName);

person1.middleName = 'Kumar';

//Accessing after defining properties
console.log('Middle Name : ' + person1.middleName);
