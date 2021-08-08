console.log("chat Application")

class User {
  name: string;
  message: Map<string, string>;
  constructor(name: string, message: Map<string, string>) {
    this.name = name;
    this.message = message;
  }
}

let msgUser1 = new Map();
msgUser1.set('message1', 'This is the message 1');
msgUser1.set('message2', 'This is the message 2'); ///adding messages to map

let user1 = new User('Sen', msgUser1); //creating object of user

let msgUser2 = new Map();
msgUser2.set('message1', 'This is the message 1');
msgUser2.set('message2', 'This is the message 2'); ///adding messages to map

let user2 = new User('Rahul', msgUser2); //creating object of user

let msgUser3 = new Map();
msgUser3.set('message1', 'This is the message 1');
msgUser3.set('message2', 'This is the message 2'); ///adding messages to map

let user3 = new User('Sasi', msgUser3); //creating object of user

let msgUser4 = new Map();
msgUser4.set('message1', 'This is the message 1');
msgUser4.set('message2', 'This is the message 2'); ///adding messages to map

let user4 = new User('Susa', msgUser4); //creating object of user

let msgUser5 = new Map();
msgUser5.set('message1', 'This is the message 1');
msgUser5.set('message2', 'This is the message 2'); ///adding messages to map

let user5 = new User('Aki', msgUser5); //creating object of user

let msgUser6 = new Map();
msgUser6.set('message1', 'This is the message 1');
msgUser6.set('message2', 'This is the message 2'); ///adding messages to map

let user6 = new User('Karna', msgUser6); //creating object of user


let chatroom1= new Map<String, Map<Set<String>,Set<String>>>();
chatroom1.set(user1.name,msgUser1);
chatroom1.set(user2.name,msgUser2);
chatroom1.set(user3.name,msgUser3);

let chatroom2= new Map<String, Map<Set<String>,Set<String>>>();
chatroom2.set(user4.name,msgUser4);
chatroom2.set(user5.name,msgUser5);
chatroom2.set(user6.name,msgUser6);


console.log("ChatRoom1");
console.log(chatroom1);

console.log("ChatRoom2");
console.log(chatroom2);

console.log("List of users in chat room 1");
const iterator1 = chatroom1.keys();
console.log(iterator1.next().value);
console.log(iterator1.next().value);
console.log(iterator1.next().value);

console.log("List of users in chat room 2");
const iterator2 = chatroom2.keys();
console.log(iterator2.next().value);
console.log(iterator2.next().value);
console.log(iterator2.next().value);
