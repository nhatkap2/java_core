import java.util.Scanner;

public class N {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			int n = input.nextInt();
			int[][] a = new int[n][n];
			int cur = n * n;
			for (int i = 0; i < (n+1)/2; i++) {
				for (int j = i; j < n - i - 1; j++) a[i][j] = cur--;
				for (int j = i; j < n - i - 1; j++) a[j][n - i - 1] = cur--;
				for (int j = n - i - 1; j > i; j--) a[n - i - 1][j] = cur--;
				for (int j = n - i - 1; j > i; j--) a[j][i] = cur--;
			}
			if(n % 2 == 1) a[n/2][n/2] = 1;
			System.out.println("Test " + x++ + ":");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%d ", a[i][j]);
				}
				System.out.println();
			}
		}
	}	
}