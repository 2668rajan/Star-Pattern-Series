package pattern;

import java.util.Scanner;

/*

* * * * *
 * * * *
  * * *
   * *
    *

*/
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>=i && j<=2*n-i && flag) {
					System.out.print("*");
					flag=false;
				}else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
