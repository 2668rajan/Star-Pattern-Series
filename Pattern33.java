package pattern;
/*

a 
B c 
D e F 
g H i J 
k L m N o 

*/

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int k=0;
		boolean flag=true;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					if(flag) {
						System.out.print((char)(97+k) + " ");
						k++;
						flag=false;
					}else {
						System.out.print((char)(65+k) + " ");
						k++;
						flag=true;
					}
				}
			}
			System.out.println();
		}
	}

}
