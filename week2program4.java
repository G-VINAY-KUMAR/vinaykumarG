import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week2program4 {
    public static int missingnum(int ar[],int pos)
    {
        int l=ar.length;
        if(pos<l-1) {
            if (ar[pos + 1] - ar[pos] > 1)
                return ar[pos] + 1;
            return missingnum(ar,pos + 1);
        }
        return 0;
    }
    public static void test(int exop,int acop)
    {
        if(exop==acop)
        {
            System.out.println("Test Case is Passed");
            return;
        }
        System.out.println("Error");
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //Size of Array
        int n=Integer.parseInt(br.readLine());
        int Array[]=new int[n];
        //Reading elements into Array
        for(int i=0;i<n;i++)
            Array[i]=Integer.parseInt(br.readLine());
        int expectedop=Integer.parseInt(br.readLine());
        int actualop=missingnum(Array,0);
        test(expectedop,actualop);
    }
}
