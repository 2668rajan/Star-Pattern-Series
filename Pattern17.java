package pattern;

import java.util.Scanner;

/*

   1
  212
 32123
4321234
 32123
  212
   1


*/

public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int k=0;
		for(int i=1;i<=2*n-1;i++) {
			k = (i<=n)?i:(2*n-i);
			for(int j=1;j<=2*n-1;j++) {
				if(i<=n) {
					if(j>=n+1-i && j<=n-1+i) {
						System.out.print(k);
						if(j<n) {
							k--;
						}else {
							k++;
						}
					}else {
						System.out.print(" ");
					}
				}
				else {
					if(j>=i+1-n && j<=3*n-1-i) {
						System.out.print(k);
						if(j<n) {
							k--;
						}else {
							k++;
						}
					}else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
