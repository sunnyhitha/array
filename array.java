/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
int max=0;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
max=a[0];
for(int i=1;i<n;i++)
{
	if(max<a[i])
	{
		max=a[i];
	}
}
System.out.println("\n"+max);
}// your code goes here
	}
}
