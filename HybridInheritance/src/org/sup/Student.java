package org.sup;

public class Student extends Person {

public void message() {

	System.out.println("This is student class.");
}

public void display() {
// invoke or call current method
 message();
 
 super.message();
}
}
