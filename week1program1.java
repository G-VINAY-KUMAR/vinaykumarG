import java.io.*;
import java.util.*;
class week1program1
{
    public static void main (String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Reading Input
        String[] str=new String[1000];
        str=br.readLine().split(" ");
        int k=str.length;
        int i=0;
        int [] ip=new int[k];
        for(String s:str)
            ip[i++]=Integer.parseInt(s);
        // Reading Output
        String[] str1=new String[1000];
        str1=br.readLine().split(" ");
        k=str1.length;
        int[] op=new int[k];
        i=0;
        for(String s:str1)
            op[i++]=Integer.parseInt(s);
        for(i=0;i<k;i++)
        {
            int a=min(ip[i]);
            test(a,op[i]);
        }
        System.out.println("All Cases Passed");
    }
    //minimum length  function
    public static int min(int n)
    {
        int count=0;
        while(n>1)
        {
            if((n&1)==0)
            {
                n=n>>1;
                count++;
            }
            else {
            if (ispoweroftwo(n+1))
                n = n + 1;
            else if (ispoweroftwo(n - 1))
                n = n - 1;
            else
                n = n - 1;
            count++;
        }
        }
        return count;
    }
    //checks the number whether it is a power of not
    public static boolean ispoweroftwo(int n)
    {
        return ((n&(n-1))==0);
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
            System.out.println(a);
    }
}