package com.csi.gfg;
final class C{
	private final double in;
	private final double re;
	C(double in,double re)
	{
		this.in=in;
		this.re=re;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "in="+this.in+"re="+this.re;
	}
}
public class G_third {
	public static void main(String[] args) {
		
	
C c23=new C(43.5, 56.7);
System.out.println(c23);
}
}
