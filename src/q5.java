public class q5
{
	public static void main(String[] args)
	{
     int[] arr = {9,1,7,2,8};
     int count =0;
     for(int i=0;i<arr.length-1;i++) 
     {
    	 for(int j=i+1;j<arr.length;j++) 
    	 {
    		 if(arr[i]>arr[j]) 
    		 {
    			 System.out.println("{"+arr[i]+" , "+arr[j]+"}");
    			 count++;
    		 }
    	 }
     }
		if(count>0)
                System.out.println("inversion count: "+count);
		else
                System.out.println(0);
	}
}
