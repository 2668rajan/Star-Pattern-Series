package pattern;

import java.util.Scanner;

/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
public class Pattern19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n;j++) {
				if(i<=n) {
					if(j<=i || j>=2*n+1-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else {
					if(j<=2*n-i || j>=i+1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
