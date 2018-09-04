import java.util.Scanner;

public class J {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		while (test-- > 0){
			int n = input.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				boolean check = true;
				for (int j = 0; j < i; j++) {
					if (a[i] < a[j]) {
						check = false;
						break;
					}
				}
				if(check) max++;
			}
			System.out.println(max);
		}
	}	
}