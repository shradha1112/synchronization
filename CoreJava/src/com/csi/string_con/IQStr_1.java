package com.csi.string_con;
//reverse a string 
//1. using string buffer or string builder
class StringFormatter
{ 
	public static String reverseStr(String str)
	{
	StringBuilder sb=new StringBuilder(str);
	StringBuffer sb1=new StringBuffer(str);
	
sb.reverse();
return sb.toString();
	}
	}

//2.using string class 
class StringFormatter2
{
	public static String reverseStr2(String str)
	{
		String s1=new String(str);
		char C[]=s1.toCharArray();
		int i;
		String rev="";
		for(i=str.length()-1;i>=0;i--)
			{
			rev=rev+C[i];
			
			
			}
		return rev;
		}}
public class IQStr_1 {
public static void main(String[] args) {
	System.out.println(StringFormatter.reverseStr("Brain works quickly"));
	StringFormatter2 s2=new StringFormatter2();

	System.out.println(StringFormatter2.reverseStr2("I work on java"));
	
}
}
