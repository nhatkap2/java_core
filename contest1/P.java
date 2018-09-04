import java.util.Scanner;

public class P {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			int n = input.nextInt();
			int m = input.nextInt();
			int[][] a = new int[n][m];
			int[][] b = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = input.nextInt();
					b[j][i] = a[i][j];
				}
			}
			int[][] c = new int[n][n];
			System.out.println("Test " + x++ + ":");
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++){
					for (int k = 0; k < m; k++) {
						c[i][j] += (a[i][k] * b[k][j]);
					}
					System.out.printf("%d ", c[i][j]);
				}
				System.out.println();
			}
		}
	}	
}