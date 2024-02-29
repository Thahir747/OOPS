import java.util.*;
class complex
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of first complex number:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the real and imaginary part of second complex number:");
		int c=s.nextInt();
		int d=s.nextInt();
		System.out.println("Complex numbers are:\n"+a+"+i"+b+"\n"+c+"+i"+d);
		int p=a+c;
		int f=b+d;
		System.out.println("Added complex number is:"+p+"+i"+f);
	}
}
