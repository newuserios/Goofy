package aa.aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pyramidAddition {
	
	/* swapping int value.
	 public static void main(String[] aaq)
	{
		int a = 200 ,b =80;
		
		System.out.println("Actual values: " + "a = " + a + " " + "b = " +  b );
		a = a + b ;
		b = a-b;
		a = a-b;		 
		System.out.println("Swapped values: " + "a = " + a + " " + "b = " +  b );
		
		
	}
*/
	
	/* Array to swap number & String
	public static void main(String [] b)
	{
	//	int a [] = {8,3};
		//int  t;
		String a[] = {"hello" , "rty"};
		String t;
		System.out.println("Actual values: " + a[0] + " ," + a[1] );
		for(int i=0;i<1;i++)
		{
		t = a[i];
		a[i] = a[i+1];
		a[i+1] = t;
		System.out.println(a[i] + ", " + a[i+1]);
		}
		
	}*/
	
	public static void main(String[] a1)
	{
		int a[] = {8,3};
		ArrayList al = new ArrayList();
		al.add(a[0]);
		al.add(a[1]);
		Collections.swap(al,0,1);
		System.out.println("swapped list " + al);	
	}
}
