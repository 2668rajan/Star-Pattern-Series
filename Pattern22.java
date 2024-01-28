package pattern;
/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				k=1;
			}else {
				k=0;
			}
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(k + " ");
					if(k==1) {
						k=0;
					}else {
						k=1;
					}
				}
			}
			System.out.println();
		}
	}

}
