import java.io.*;
import java.util.*;
class week1program3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Reading Input
        int n=Integer.parseInt(br.readLine());
        int error=0;
        int actualop[] = new int[n+1];
       int expectedop[] = new int[n+1];
       //Reading Expected Output
        for(int i=0;i<=n;i++)
        {
            expectedop[i]=Integer.parseInt(br.readLine());     
        }
        //Function calling to calculate no. of set bits
        actualop = setbitcal(n,actualop); 
        //checking output with expexted output
        for(int i=0;i<=n;i++)
        {
            if(actualop[i]!=expectedop[i])
                error++;
        }
        if(error>0)
            System.out.println(error+" Errors");
        else
            System.out.println("Test case passed");
    }
    public static int[] setbitcal(int n,int count[])
    {
        count[0]=0;
        for(int i=1;i<=n;i++)
        {
            count[i]=1+count[i & (i-1)];  
        }
        return count;
    }
}


