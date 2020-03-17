import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class week2program6 {
    public static void test(int exop,int acop)
    {
        if(exop==acop)
            System.out.println("Test Case is Passed");
        else
            System.out.println("Test Case is Failed");
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //Size of Array
        int n=Integer.parseInt(br.readLine());
        //Reading Elements of Array
        int Array[]=new int[n*2];
        for(int i=0;i<n*2;i++)
            Array[i]=Integer.parseInt(br.readLine());
        int expectedop=Integer.parseInt(br.readLine());
        Arrays.sort(Array);
        int median=(Array[n-1]+Array[n])/2;
        test(expectedop,median);
    }
}
