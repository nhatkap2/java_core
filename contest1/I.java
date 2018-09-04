import java.util.Scanner;

public class I {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			int n = input.nextInt();
			int m = input.nextInt();
			int p = input.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = input.nextInt();
			}
			System.out.println("Test " + x++ + ":");
			for(int i = 0; i < p; i++) {
				System.out.print(a[i] + " ");
			}
			for(int i = 0; i < m; i++) {
				System.out.print(b[i] + " ");
			}
			for(int i = p; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}		
	}	
}