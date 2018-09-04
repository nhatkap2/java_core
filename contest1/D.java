public class D {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		while(test-- > 0){
			int n = scan.nextInt();
			long k = 0;
			if(n % 2 == 0){
				for (int i = (int) Math.pow(10, n / 2 - 1); i < (int) Math.pow(10, n / 2); i++) {
					if((IntegerNumber.sumDigit(i) * 2) % 10 == 0) k++;
				}
			}
			else{
				for (int j = 0; j < 10; j++) {
					for (int i = (int) Math.pow(10, n / 2 - 1); i < (int) Math.pow(10, n / 2); i++) {
						if((IntegerNumber.sumDigit(i) * 2 + j) % 10 == 0) k++;
					}
				}
			}
			System.out.println(k);
		}
	}
}