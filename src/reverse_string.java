import java.util.Scanner;
public class reverse_string
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
			String text = in.nextLine();
			char[] arr = text.toCharArray();
			String rev = "";
			for (char i : arr)
			    rev = i + rev;
			System.out.println(rev);
		}
	}