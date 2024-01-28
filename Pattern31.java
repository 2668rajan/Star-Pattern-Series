package pattern;
/*

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

*/

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				int top=i;
				int left=j;
				int right = (2*n-2)-j;
				int down = (2*n-2)-i;
				
				System.out.print(n-Math.min(Math.min(left, right), Math.min(top, down)) +" ");
			}
			System.out.println();
		}
	}

}
