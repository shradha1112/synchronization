package com.csi.string_con;
interface A{
	 default void show()
	{
		System.out.println("fron interface");
	}
}
 class B implements A
{ public void show(){
	A.super.show();
	System.out.println("FROOOM b");
	
	
}
	 
	}
public class Supe_Key {
	public static void main(String[] args) {
		
	
B a=new B();
 a.show();
	}
}
