/*package rrrr;

import java.util.Scanner;

public class rrrr {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("輸入");
		String str;
			str=sc.nextLine();
		System.out.print("welcome"+str);
	}
*/	
package rrrr;

import java.lang.Math;
import java.util.Scanner;

public class rrrr{
	
	static int pv;
	static double fv;
	static final double interest=0.05;
	static int interval=0;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("輸入本金:");
		pv =sc.nextInt();
		System.out.print("輸入年數:");
		interval = sc.nextInt();
		
		fv = pv * Math.pow((1+interest), interval);
		
		System.out.println("My pv is "+ pv + " and after "+interval + "year it would be "+fv);
	
	

	}
}