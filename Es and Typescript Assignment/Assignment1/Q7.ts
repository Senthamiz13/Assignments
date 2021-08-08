let info = ['Sen', 'm', '23', '180'];
let [name1, gender, age, height] = info;
console.log(age);


////////////////////////////////

var obj = {
  student: 'sen',
  address: { 
    street: 'APJ Abdul Kalam Street',
    city: 'Puducherry',
    pin: 605014 
  }
};

let { student, address } = obj;
console.log(address.pin);
