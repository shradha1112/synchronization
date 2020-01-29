package com.csi.string_con;
class Parent{
Parent show1()
	{
		System.out.println("from Parent");
		return null;
	}
	
}
class Base extends Parent
{
	Base show1()
	{ 
		super.show1();
		System.out.println("from Base");
		return null;
	}
	
	}
public class Covariant_Retu {
public static void main(String[] args) {
	Base b=new Base();
	b.show1();
	
}
}
