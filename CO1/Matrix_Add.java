import java.util.*;
class Matrix
{
int a[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
void create(int l)
{
	for(int i=0;i<l;i++)
		for(int j=0;j<l;j++)
		a[i][j]=sc.nextInt();
}
void display(int l)
{

for(int i=0;i<l;i++)
	{
		for(int j=0;j<l;j++)
		System.out.print(a[i][j]+" ");
		System.out.println("");
	}
}
}
class Matrix_Add
{
public static void main(String args[])
{
Matrix m1,m2,sum;
int l;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of matrix: ");
l=sc.nextInt();
m1=new Matrix();
m2=new Matrix();
sum=new Matrix();
System.out.println("Enter the elements of first matrix: ");
m1.create(l);
System.out.println("Enter the elements of second matrix: ");
m2.create(l);

for(int i=0;i<l;i++)
	{
		for(int j=0;j<l;j++)
		sum.a[i][j]=m1.a[i][j]+m2.a[i][j];
	}		

System.out.println("The sum matrix is:");
sum.display(l);	
}
}

