import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class week2program2 {
    public static void segment_sum(int segment[],int a[],int pos,int start,int end)
    {
         if(start==end)
         {
             segment[pos]=a[start];
             return;
         }
         segment_sum(segment,a,2*pos+1,start,end/2);
         segment_sum(segment,a,2*pos+2,(end/2)+1,end);
         segment[pos]=segment[2*pos+1] + segment[2*pos+2];
         return;
    }
    public static void update(int segment[],int start,int end,int updatepos,int val,int pos)
    {
        if(updatepos<start || updatepos > end )
            return;
        segment[pos] = segment[pos] + val;
        if(end != start)
        {
            int mid = (start + end)/2;
            update(segment,start,mid,updatepos,val, 2*pos+1);
            update(segment,mid+1,end,updatepos,val,2*pos+2);
        }
    }
    public static int findsum(int segment[],int left,int right,int start,int end,int pos)
    {
        if(left>end || right<start)
            return 0;
        if(left<=start && right>=end)
            return segment[pos];
        return findsum(segment,left,right,start,end/2,2*pos+1) + findsum(segment,left,right,(end/2)+1,end,2*pos+2);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Size of an array
        int n=Integer.parseInt(br.readLine());
        int Array[]=new int[n];
        //Reading array elements
        for(int i=0;i<n;i++)
            Array[i]=Integer.parseInt(br.readLine());
        int segment[]=new int[n*4];
        segment_sum(segment,Array,0,0,n-1);
        while(true) {
            System.out.println("1.Update Value::\n2.Sum between Range::\n3.Exit\n");
            int op = Integer.parseInt(br.readLine());
            switch (op) {
                case 1:
                    System.out.println("Enter Index position ::");
                    int pos = Integer.parseInt(br.readLine());
                    int index=Integer.parseInt(br.readLine());
                    int val=segment[index];
                    segment[index]=Integer.parseInt(br.readLine());
                    val=segment[index]-val;
                    update(segment,0,n-1,index,val,0);
                    break;
                case 2:
                    System.out.println("Enter Left Index and Right Index::");
                    int l = Integer.parseInt(br.readLine());
                    int r = Integer.parseInt(br.readLine());
                    System.out.println(findsum(segment, l, r, 0, n - 1, 0));
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
