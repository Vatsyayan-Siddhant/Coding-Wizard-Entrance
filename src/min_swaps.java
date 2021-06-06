import java.util.Scanner;
public class min_swaps
{

	public static void main(String[] args) 
	{		
	  int c = 0;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Input number of elements : ");
	  int x = sc.nextInt();
      int[] num = new int [x];
      for(int i =0; i<num.length ; i++)
      {
    	  num[i]=sc.nextInt();
      }
      for(int i =0;i<num.length-1;i++) 
      {
          for(int j=0;j<num.length-i-1;j++) 
          {
         	 if(num[j]>num[j+1]) 
         	 {
         		 int temp=0;
         		 temp=num[j];
         		 num[j]=num[j+1];
         		 num[j+1]=temp;
         		 c++;
         	 }
          }
      }
         System.out.println("Minimum swaps required : "+c);
         sc.close();
	}
}
