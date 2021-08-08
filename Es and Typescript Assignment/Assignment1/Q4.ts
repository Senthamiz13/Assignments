let names = ['Tom', 'Ivan', 'jerry'];

var arrow = (names: string[]) => {
  let out = []; //empty array

  for (let name of names) {
    var row: any = {}; //empty object

    row.name = name; //key name and value name value
    row.length = name.length; //key is length and value is name length

    out.push(row); // pushing object into array
  }
  return out; // return a array of objects
};

console.log(arrow(names));
