package com.java.patterns;

public class LogicBuilding {
public static void space(int n)
{
	for (int j=0;j<=n;j++)
	{
		System.out.print(" ");
	}
}
public static void main(String args[])
{
	int n=5,space=n;
	for(int i=1; i<5;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		space(space);
		for (int j=i;j>0;j--)
		{
			System.out.print(j);
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
	space=1;
	for(int i=3;i>0;i--){
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		space(space);
		for(int j=i;j>0;j--)
		{
			System.out.print(j);
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