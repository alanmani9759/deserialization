package org.multiple;

public class Child implements Parent1,Parent2{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		Parent1.super.fun();
		Parent2.super.fun();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.fun();
	}
}
