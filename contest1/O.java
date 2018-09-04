import java.util.Scanner;
import java.util.ArrayList;

public class O {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int m = 0;
		while (list.size() != (15*15)){
			if(IntegerNumber.isPrimeNumber(m)) list.add(m);
			m++;
		}
		m = 1;
		while (test-- > 0){
			int n = input.nextInt();
			int[][] a = new int[n][n];
			int cur = 0;
			for (int i = 0; i < (n+1)/2; i++) {
				for (int j = i; j < n - i - 1; j++) {
					a[i][j] = list.get(cur++);
				}
				for (int j = i; j < n - i - 1; j++) {
					a[j][n - i - 1] = list.get(cur++);
				}
				for (int j = n - i - 1; j > i; j--) {
					a[n - i - 1][j] = list.get(cur++);
				}
				for (int j = n - i -1; j > i; j--) {
					a[j][i] = list.get(cur++);
				}
			}
			System.out.println("Test " + m++ + ":");
			if(n % 2 == 1) a[n/2][n/2] = list.get(cur++);
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++){
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}		
	}	
}