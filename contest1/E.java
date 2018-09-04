public class E {
	public static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		while(test-- > 0){
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(a > b){
				long tmp = a;
				a = b;
				b = tmp;
			}
			long k = 0;
			for (long i = a; i <= b; i++) {
				if(IntegerNumber.isPrimeNumber(i) && IntegerNumber.AreAllDigitPrime(i) && IntegerNumber.isPrimeNumber(IntegerNumber.sumDigit(i))){
					k++;
				}
			}
			System.out.println(k);
		}
	}
}