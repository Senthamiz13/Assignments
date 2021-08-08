function person(fname,lname,age,skills,dateofbirth,address,married,profession)
{
this.fname=fname;
this.lname=lname;
this.age=age;
this.skills=skills;
this.dateofbirth=dateofbirth;
this.address=address;
this.married=married;
this.profession=profession;

}

var person1 = new person("Sen","thamiz",23,["java","Python"],"01/03/1998",{city:"Puducherry",pincode:"521185"},"false","analyst");

var person2=new person("Vignesh","Kumar",23,{"HTML","Java","Css"],"08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jr analyst");

print=function()
{
console.log(person1);
console.log(person2);
}();
