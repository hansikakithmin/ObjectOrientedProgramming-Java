package Ex1;

public class Student {
  String name,ditno,address;

  
  //parameterized constructors (ex2 part)
  /*public Student(String newname, String newditno, String newaddress) {
	  this.name=newname;
	  this.ditno=newditno;
	  this.address=newaddress;
  }*/

  //mutattor and accesor methods(ex3 part)
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDitno() {
	return ditno;
}


public void setDitno(String ditno) {
	this.ditno = ditno;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}

//ex4
String getDetails(){//can also put void
	String s = "I am Student.\nMy name is"+getName()+"\nI am from"+getAddress()+"\nMy dit no is"+getDitno();
	return s;
}
  
  
}
