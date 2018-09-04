import java.util.Scanner;
import java.lang.Math;

public class B {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		while(test-- != 0){
			long n = scan.nextLong();
			long k = (long) Math.log10(n) + 1;
			k = (long) Math.pow(10, k - 1);
			if((n/k) == (n%10)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}