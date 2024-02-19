import java.util.*;
class Average
{
	public static void main(String args[])
		{
		  int a[]= new int[10];
		  int l,sum=0;
		  Scanner ob=new Scanner(System.in);
		  System.out.println("Enter the size of array:");
		  l=ob.nextInt();
		  System.out.println("Enter the elements:");
	for(int i=0;i<l;i++)
	 {
		a[i]=ob.nextInt();
		sum=sum+a[i];
	 }
	System.out.println("The sum is:"+sum);
	int avg=sum/l;
	System.out.println("The Average is:"+avg);
	
    }
}
