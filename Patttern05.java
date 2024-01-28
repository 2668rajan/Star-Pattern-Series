package pattern;

import java.util.Scanner;

/*

*
**
***
****
*****
****
***
**
*

*/
public class Patttern05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<n;j++) {
				if(i<n) {
					if(j<=i) {
						System.out.print("*");
					}
				}
					else {
					if(j<=2*n-2-i) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
