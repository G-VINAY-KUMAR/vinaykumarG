import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week2program8 {
    public static void swap(int a[][],int x,int y)
    {
        int t1=a[x][0];
        int t2=a[x][1];
        a[x][0]=a[y][0];
        a[x][1]=a[y][1];
        a[y][0]=t1;
        a[y][1]=t2;
    }
    public static void sort(int a[][],int p,int n)
    {
        if(p==n-1)
            return;
        for(int i=p+1;i<n;i++)
        {
            if(a[p][0]==a[i][0])
            {
                int d1=a[p][1]-a[p][0];
                int d2=a[i][1]-a[i][0];
                if(d1>d2)
                    swap(a,p,i);
                else
                    swap(a,p+1,i);
            }
            else if(a[p][0] > a[i][0])
                swap(a,p,i);
        }
        sort(a,p+1,n);
        return;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Number of Events
        int n=Integer.parseInt(br.readLine());
        int Events[][]=new int[n][2];
        //Reading Events Days
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
                Events[i][j]=Integer.parseInt(br.readLine());
        }
        sort(Events,0,n);
        for(i=n-1;i>0;i--)
        {
            if(Events[i][1]!=Events[i-1][1])
                break;
        }
        System.out.println(i+1);
    }
}