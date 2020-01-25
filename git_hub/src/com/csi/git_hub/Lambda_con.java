package com.csi.git_hub;
@FunctionalInterface
interface First
{public void view();
	}
public class Lambda_con {
public static void main(String[] args) {
	First la=()->{System.out.println("First git");};
	la.view();
	
}
}
