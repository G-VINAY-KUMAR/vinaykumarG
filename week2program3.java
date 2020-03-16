import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week2program3 {
    public static int frequency(int arr[],int k,int pos,int c)
    {
        int l=arr.length;
        if(pos>=l)
        {
            return 0;
        }
        c=c+frequency(arr,k,pos+1,c);
        if(arr[pos]==k) {
            c = c + 1;
        }
        return c;
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Size of array
        int n=Integer.parseInt(br.readLine());
        int Array[]=new int[n];
        //reading array elements
        for(int i=0;i<n;i++)
        {
            Array[i]=Integer.parseInt(br.readLine());
        }
        //reading key to search
        int count=0;
        int key=Integer.parseInt(br.readLine());
        //Reading expected output
        int expectedop=Integer.parseInt(br.readLine());
        int actualop=frequency(Array,key,0,count);
        test(expectedop,actualop);
    }
}
