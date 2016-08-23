import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ int n,i;
		Scanner s=new Scanner(System.in);
		int[] a=new int[n];
		int n=s.next();
		for( i=0;i<n;i++)
		{
		a[i]=s.next();
		}
		Arrays.sort(a);
		if(a[i]==i)
		{
		  System.out.println(i);
		}
		else
		System.out.println("no");
	}
}
