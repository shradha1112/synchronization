package com.csi.gfg;
class Aparent
{
	 public void show()
	{
		System.out.println("Aparent show");
		
	}
	//System.out.println("A instance of obj class"+Aparent instanceof Object);
}
	/*class Abase extends Aparent
	{
		public void show()
		{     //super.show();
			  System.out.println("Abase show");
		}
	}
	*/
public class G_fisrt {
	/*public static void Doshow(Aparent a)
	{
		a.show();
	}*/
public static void main(String[] args) {
	Aparent c=new Aparent();
	System.out.println("A instance of obj class"+(c instanceof Object));
	/*Aparent b=new Abase();
	Abase s= new Abase();
	Doshow(c);
	Doshow(b);
	Doshow(s);*/
}
}
