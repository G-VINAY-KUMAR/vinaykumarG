import java.io.*;
import java.util.*;
class week1_program4 {
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size,actualop,expectedop;
	//Size of Array
        size =Integer.parseInt(br.readLine());           
        int input[] = new int[size];
	//Reading Array Elements
        for(int i=0;i<arrlength;i++)
            input[i] =Integer.parseInt(br.readLine()); 
	//Reading Expected output      
        expectedop = Integer.parseInt(br.readLine());           
        actualop = maxXOR(input);           
        if(actualop == expectedop)
            System.out.println("Test case passed");
        else
            System.out.println("Error");

    }
	public static int maxXOR(int[] nums) {
        	int max = 0,mask = 0;
        	for(int i = 8; i >= 0; i--){
            		mask = mask | (1 << i);
            		Set<Integer> set = new HashSet<>();
            		for(int num : nums){
                		set.add(num & mask);
            		}
            		int tmp = max | (1 << i);
            		for (int prefix : set) {
                		if (set.contains(tmp ^ prefix)) {
                    			max = tmp;
                    			break;
                		}
            		}
        	}
        	return max;
    }
}