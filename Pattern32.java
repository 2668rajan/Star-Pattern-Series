package pattern;
/*

E 
D E 
C D E 
B C D E 
A B C D E 

*/
import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch = (char)('A'+n-i);
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}

}
