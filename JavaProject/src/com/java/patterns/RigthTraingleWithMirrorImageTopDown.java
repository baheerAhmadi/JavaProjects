package com.java.patterns;

public class RigthTraingleWithMirrorImageTopDown {

public static void main(String args[])
{
	int n=4;
	for(int i=0; i<n;i++)
	{
		for (int j=1;j<=i+1;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}

	for(int i=n-1;i>0;i--){
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
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