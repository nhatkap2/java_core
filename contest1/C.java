public class C {
	public static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		while(test-- != 0){
			if(IntegerNumber.sumDigit(scan.nextLong()) % 10 == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}