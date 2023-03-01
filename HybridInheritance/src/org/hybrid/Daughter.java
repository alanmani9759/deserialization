package org.hybrid;

public class Daughter extends Father {

	public static void daughter() {
       System.out.println("i am the daughter");
	}
	
	public static void main(String[] args) {
		 father();
		 grandFather();
		 Son.son();
		 daughter();
		
	}
}
