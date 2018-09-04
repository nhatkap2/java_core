import java.util.Scanner;

public class Q {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			int n = input.nextInt();
			int m = input.nextInt();
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = input.nextInt();
				}
			}
			int row = 0, col = 0;
			int max = 0;
			for (int i = 0; i < n; i++) {
				int k = 0;
				for (int j = 0; j < m; j++) {
					k += a[i][j];
				}
				if(k >= max){
					max = k;
					row = i;
				}
			}
			max = 0;
			for (int i = 0; i < m; i++) {
				int k = 0;
				for (int j = 0; j < n; j++) {
					if(j != row){
						k += a[j][i];
					}
				}
				if(k >= max){
					max = k;
					col = i;
				}
			}
			System.out.println("Test " + x++ + ":");
			for (int i = 0; i < n; i++) {
				if(i != row){
					for (int j = 0; j < m; j++) {
						if(j != col) System.out.printf("%d ", a[i][j]);
					}
					System.out.println();
				}
			}
		}
	}	
}