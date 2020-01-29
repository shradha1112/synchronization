package com.csi.string_con;

public class Stringss {
	public static void main(String[] args) {
		
	
String s1="Shradha";//same as below
String s2="Shradha";//s2 Stored in Constant Memory
String s3=new String("Shradha");//s3 stored in heap memory
String s4=new String("Shradha");
String s5=new String("Patil");
  s1.concat(s2);
System.out.println(s1);//mutable==means modification in string s1 is not possible
System.out.println(s1==s2);//true
System.out.println(s1==s3);//false bcoz of different memory locaton
System.out.println(s3==s4);//
System.out.println(s2);
System.out.println(s3.concat(s4));
System.out.println(s3);//mutable property
System.out.println("s1.equals(s2)="+s1.equals(s2));//true bcoz checks for contents of an object
System.out.println("s1.equals(s5)="+s1.equals(s5));//false


//String Builder
StringBuilder sb1=new StringBuilder("ABC");
StringBuilder sb2=new StringBuilder("ABC");
sb1.append(sb2);
System.out.println(sb1);//Immutable = append changes reflect in sb1
//String Buffer
StringBuffer sbb1=new StringBuffer("XYZ");
StringBuffer sbb2=new StringBuffer("XYZ");
sbb1.append(sbb2);
System.out.println(sbb1);//immutable
}
}