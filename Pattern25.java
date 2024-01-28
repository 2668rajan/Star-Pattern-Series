package pattern;
/*

*****
*   * 
*   *  
*   *   
*****    

*/

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i==1 && j>=n) {
					System.out.print("*");
				}
				else if(i==n && j<=n) {
					System.out.print("*");
				}else {
					if(j==n+1-i || j==2*n-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
