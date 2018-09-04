import java.util.Scanner;

public class G {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		while (test-- > 0){
			int n = input.nextInt();
			int k = 0;
			for (long i = (long) Math.pow(10, n - 1); i < (long) Math.pow(10, n); i++) {
				if((check1(i) || check2(i)) && IntegerNumber.isPrimeNumber(i)) {
					k++;
					//System.out.println(i);
				}
			}
			System.out.println(k);
		}

	}
	public static boolean check1(long a){
		long pre = -1;
		long n = a;
		while (n > 0){
			long k = n % 10;
			if(k <= pre) return false;
			pre = k;
			n /= 10;
		}
		return true;
	}
	public static boolean check2(long a){
		long pre = 10;
		long n = a;
		while (n > 0){
			long k = n % 10;
			if(k >= pre) return false;
			pre = k;
			n /= 10;
		}
		return true;
	}
}