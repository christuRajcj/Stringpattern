import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input : ");
		String s = scan.next();
		int i,j,k;
		System.out.println("Output : ");
		for(i=1;i<=s.length();i++)
		{
			int mid = s.length() / 2;
			for(j=s.length();j>i;j--)
			{
				System.out.print("\t");
			}
			for(k=i;k>0;k--)
			{
				if(mid >= s.length())
				{
					mid = 0;
				}
				System.out.print(s.charAt(mid) + "\t");
				mid++;
			}
			System.out.println();
		}
	}

}