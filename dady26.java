/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int number=sc.nextInt();
       int i,fact=1;
       for(i=1;i<=number;i++)
       {  
          fact=fact*i;
          System.out.println("factorial of a number is"+fact);
       }
	}
}
