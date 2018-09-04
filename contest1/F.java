public class F {
	public static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		while(test-- > 0){
			int n = scan.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextLong();
			}
			boolean check = true;
			for (int i = 0; i < n/2; i++) {
				if(a[i] != a[n - i - 1]) {
					check = false;
					break;
				}
			}
			if(check) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}