import java.util.Scanner;
public class q9
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string ");
			String text = in.nextLine();
			char[] arr = text.toCharArray();
			String rev = "";
			for (char i : arr)
			    rev = i + rev;
			System.out.println(rev);
		}
	}
