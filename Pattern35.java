package pattern;
/*

1      1
12    21
123  321
12344321

*/

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=2*n;j++) {
				if(j<=i || j>=2*n+1-i) {
					if(j>n) {
						k--;
					}
					System.out.print(k);
					if(j<=n) {
						k++;
					}
					
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
