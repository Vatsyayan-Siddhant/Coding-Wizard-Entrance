import java.util.Scanner;
public class q10
{
	   public static void main(String[] args) 
	   {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        String x=in.nextLine();
	        	System.out.println("value of "+ x + " + " + x + x + " + " + x + x + x + "  " +"is :" +"  "+(Integer.parseInt(x) + Integer.parseInt(x + x) + Integer.parseInt(x + x + x)));
	    }
} 
