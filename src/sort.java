import java.util.Scanner;
public class sort
{
	public static void main(String[] args)
	{	
	 int c = 0;
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter number of elements you want to enter: ");
	 int n = in.nextInt();
    int[] num = new int [n];
    for(int i =0; i<num.length ; i++)
    {
  	  System.out.println("Enter element "+(i+1)+": ");
  	  num[i]=in.nextInt();
    }
	 System.out.println("Your choice: ");
     String s= in.next();
     switch(s) 
     {
     case "ascending" : 	 
     for(int i =0;i<num.length-1;i++) 
     {
         for(int j=0;j<num.length-i-1;j++) 
	 {
        	 if(num[j]>num[j+1]) {
        		 int temp=0;
        		 temp=num[j];
        		 num[j]=num[j+1];
        		 num[j+1]=temp;
        	 }
         }
     }
        for(int k =0;k<num.length;k++) 
	{
            System.out.println(num[k]); 
        }
      break;
     case "descending":     
    	 for(int i =0;i<num.length-1;i++) 
	 {
         for(int j=0;j<num.length-i-1;j++) 
	 {
        	 if(num[j]<num[j+1]) 
		 {
        		 int temp=0;
        		 temp=num[j];
        		 num[j]=num[j+1]; 
        		 num[j+1]=temp;
        	 }
         }
     }
        for(int k =0;k<num.length;k++) 
	{
            System.out.println(num[k]); 
        }
        break;
     }
	}
}
