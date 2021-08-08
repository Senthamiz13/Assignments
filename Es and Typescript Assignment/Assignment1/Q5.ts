let addvalue = function(a = 5) {
  console.log(a);
};
addvalue();
addvalue(25);

////////////////////////////////////////

var listOfFriends = ['Sasi', 'Sen', 'Susa', 'Karna', 'Aki'];

let userFriends = function(
  username: any,
  ...friends: any //rest operator used
) {
  console.log(username);
  for (let friend of friends) {
    console.log(friend);
  }
};

var username = 'Rahul';
userFriends(username, listOfFriends);

////////////////////////////////////////

let printcapitalname = function(...names: any) 
{
  for (let name of names) {
    console.log(name.toUpperCase());
  }
};
printcapitalname(...listOfFriends);///spread Operator
