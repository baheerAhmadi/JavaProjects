package com.java.patterns;

public class LogicBuildingWithoutn {
public static void space(int n)
{
	for (int j=0;j<=n;j++)
	{
		System.out.print(" ");
	}
}
public static void main(String args[])
{
	int space=26;
	for(int i=1; i<15;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("a");
		}
		space(space);
		for (int j=i;j>0;j--)
		{
			if(j!=15)
			System.out.print("a");
		}
		System.out.println();
		space=space-2;
	}
/*	
 * 1
	12
	123
	1234
*/
	space=0;
	for(int i=14;i>0;i--){
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("a");
		}
		space(space);
		for(int j=i;j>0;j--)
		{
			System.out.print("a");
		}
		space=space+2;
		System.out.println();
	}
	
	/*	
	 * 1
		12
		123
		1234
		123
		12
		1
	*/
}
}