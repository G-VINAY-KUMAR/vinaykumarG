import java.io.*;
import java.util.*;
class week1program3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++)
        {
            int m=bitcal(i,0);
            System.out.print(m+" ");
        }
    }
    public static int bitcal(int n,int count)
    {
        if(n<1)
        {
            return count;
        }
        return bitcal(n & (n-1),count+1);
    }
}


