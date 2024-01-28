package pattern;

import java.util.Scanner;

/*
 	1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5 
 */
public class Pattern04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<n;j++) {
				if(j<=i) {
					System.out.print(k++ +" ");
				}
			}
			System.out.println();
		}
	}
}
