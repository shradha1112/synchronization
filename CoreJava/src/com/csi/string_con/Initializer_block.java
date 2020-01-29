package com.csi.string_con;
class Apple
{String color;
int i=1;
	Apple(String col){
		this.color=col;
		System.out.println(col);
		
	}{
	
		System.out.println("This is initializer block"+i);
		i=i++;
	}
	static{
		System.out.println("i am static block");
	}}
public class Initializer_block {
	public static void main(String[] args) {
		
	
Apple a=new Apple("red");
Apple a1=new Apple("maroon");
	}
}
