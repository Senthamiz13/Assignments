class Rectangle{
	constructor(length,width){
  	this.length=length;
    this.width=width;
  }
  getLength()
  {
  	return this.length;
  }
  getWidth()
  {
  	return this.width;
  }
  setLength(length)
  {
  	this.length=length;
	  return ("length Modified "+length);
  }
  getArea()
  {
  	return this.length
*this.width;
  }
}
const rec=new Rectangle(6,4);
console.log(rec.getLength());
console.log(rec.setLength(7));
console.log("Area : "+rec.getArea());
