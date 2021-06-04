import java.util.*;
class series
{
    public static void main(String [] args)
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        int n=in.nextInt();
        int a=0,b=1,c=1;   
        System.out.print(a+" ");
        if(n>1)
        	System.out.print(b+" ");
        if(n>2)
        	System.out.print(c+" ");
                for(int i=3;i<n;i++)
                {
                	int temp=a+b+c;
                	a=b;
                	c=temp;
                    System.out.print(temp+" ");
                }
    }
}