import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week2program1 {
    public static void bal_par(int n,int p)
    {
        int i=0,j;
        if(p>=n/2)
                return;
        while(i<p)
        {
            System.out.print("(");
            i++;
        }
        for( j=i;j<n-i;j=j+2)
        {
            System.out.print("()");
        }
        i=j;
        while (i<n)
        {
            System.out.print(")");
            i++;
        }
        System.out.println();
        bal_par(n,p+1);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        bal_par(n,0);
    }
}
