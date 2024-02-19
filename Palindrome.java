import java.util.*;
class Palindrome
	{
		public static void main(String args[])
	{
		System.out.println("Enter the String:");
		String og,rev="";
		Scanner ob=new Scanner(System.in);
		og=ob.nextLine();
	
		int l=og.length();
		for(int i=l-1;i>=0;i--)
		rev=rev+og.charAt(i);
	
		if(og.equals(rev))
	System.out.println("It is palindrome");
	else
		System.out.println("It is not palindrome");
	}
	}
