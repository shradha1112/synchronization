package com.csi.string_con;

import java.util.ArrayList;

public class Assert_Key {
public static void main(String[] args) {

	ArrayList<Integer> ai=new ArrayList<Integer>();
      

	ai.add(123);
	
	 assert ai!=null && ai.size()>0:"LIST VARIABLE IS nulL OR EMPTY";
	// System.out.println("null or empty");
	 
	 }
}
