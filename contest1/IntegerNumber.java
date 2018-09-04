import java.lang.Math;
public class IntegerNumber {
	public static long GCD(long a, long b){
		if(b == 0) return a;
		return GCD(b, a % b);
	}
	public static long sumDigit(long a){
		long res = 0;
		while(a > 0){
			res += (a%10);
			a /= 10;
		}
		return res;
	}
	public static boolean isPrimeNumber(long a){
		if(a == 2 || a == 3) return true;
		if(a % 2 == 0 || a % 3 == 0 || a < 2) return false;
		long i = -1, sqrt_a = (long) Math.sqrt(a);
		do{
			i += 6;
			if(a % i == 0 || a % (i+2) == 0) break;
		}
		while(i <= sqrt_a);
		return (i > sqrt_a);
	}
	public static boolean areAllDigitPrime(long a){
		if(a == 0) return false;
		while(a > 0){
			if((a%10) != 2 && (a%10) != 3 && (a%10) != 5 && (a%10) != 7) return false;
			a /= 10;
		}
		return true;
	}
	public static boolean isPalidromicNumber(long a){
		long b = 0;
		long c = a;
		while(c > 0){
			b = b * 10 + c % 10;
			c /= 10;
		}
		return (b == a);
	}
}