import java.io.*;
import java.util.*;
class week1program2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//size of array
		System.out.println("Enter Array size::");
		int n=Integer.parseInt(br.readLine());
		int [] ip=new int[n];
		int i,j,d;
		//reading input
		System.out.println("Enter Array elements::");
		for(i=0;i<n;i++)
		{
			ip[i]=Integer.parseInt(br.readLine());
		}
		// reading queries
		System.out.println("Enter queries::");
		int[][] b=new int[n][2];
		for(i=0;i<n;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		//reading expected output  
		System.out.println("Enter expected output::");
		int [] op=new int[n];
		for(i=0;i<n;i++)
		{
			op[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			d=xor(ip,b[i][0],b[i][1]);
			test(d,op[i]);
		}
	}
	//XOR finction
	public static int xor(int a[],int x,int l)
	{
		int y=0;
		for(int i=x;i<=l;i++)
		{
			y=y^a[i];
		}
		return y;
	}
	
    //testing function
    public static void test(int a,int b)
    {
        if(a!=b)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            System.out.print(a+" ");
    }
}