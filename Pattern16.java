package pattern;
/*
    1    
   1 1   
  1 2 1  
 1 3 3 1 
1 4 6 4 1

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean flag = true;
		
		List<List<Integer>> ans = new ArrayList();
		
		for(int i=0;i<n;i++) {
			List<Integer> list = new ArrayList();
			list.add(1);
			for(int j=1;j<i;j++) {
				int k = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
				list.add(k);
			}
			if(i>0)
			list.add(1);
			ans.add(list);
		}
		
		//System.out.println(ans);
		int x=0,y=0;

		for (int i = 1; i <= n; i++) {
			// flag = true;
			y=0;
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j >= n + 1 - i && j <= n - 1 + i && flag) {
					System.out.print(ans.get(x).get(y++));
					flag = false;
				} else {
					System.out.print(" ");
					flag = true;
				}
			}
			x++;
			System.out.println();
		}
	}
}
