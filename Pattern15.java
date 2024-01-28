package pattern;
/*

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/
import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i<=n) {
					if(j==n+1-i || j==n-1+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else {
					if(j==i+1-n || j==3*n-1-i ) {
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
