package pattern;
/*

E D C B A 
D C B A 
C B A 
B A 
A 

*/


import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch = (char)('A'+n-i);
			for(int j=1;j<=n;j++) {
				if(j<=n+1-i) {
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
		}
	}

}
