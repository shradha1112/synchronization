package com.csi.gfg;
class GrandParent
{ 
	public void get(){
	System.out.println("Gparent method");
	}}
class Parent extends GrandParent
{ 
	public void get(){
		super.get();
	System.out.println("parent method");
	}}
class Child  extends Parent
{ 
	public void get(){
		super.get();
	System.out.println("chid method");
	}}

public class G_Second {
Child c=new Child();
//c.get();
}
