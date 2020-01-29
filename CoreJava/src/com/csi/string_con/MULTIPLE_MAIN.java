package com.csi.string_con;

public class MULTIPLE_MAIN {
public static void main(String[] args) {
	System.out.println("hii this is multiple main block");
	String arg1="one";
	String arg2="two";
	main(arg1,arg2);
}
public static void main(String arg1, String arg2) {
	System.out.println(arg1+" "+arg2);
	int arg3=3;
	int arg4=4;
	float arg5=3.4f;
	float arg6=5.6f;
	main(arg3,arg4);
	main(arg5,arg6);
	}
public static void main(int arg3,int arg4) {
	System.out.println(arg3+" "+arg4+"\n end");
	
}
public static void main(float arg5,float arg6) {
	System.out.println(arg5+" "+arg6);
	
}
}
