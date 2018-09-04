import java.util.Scanner;
import java.util.ArrayList;

public class R {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int n = input.nextInt();
		int[][] s = new int[n][n];
		ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				s[i][j] = input.nextInt();
			}
			col.add(i);
			row.add(i);
		}
		int k = input.nextInt();
		for (int i = 0; i < k; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			row.remove(a);
			col.remove(b);
		}
		for (Integer a : row) {
			for (Integer b : col) {
				System.out.print(s[a][b] + " ");
			}
			System.out.println();
		}
	}	
}