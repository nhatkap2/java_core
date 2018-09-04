import java.util.Scanner;

public class K {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			int n = input.nextInt();
			System.out.print("Test " + x++ + ": ");
			for (int i = 2; i <= Math.sqrt(n); i++){
				if(n % i == 0 && IntegerNumber.isPrimeNumber(i)){
					int k = 0;
					while (n % i == 0){
						k++;
						n /= i;
					}
					System.out.print(i + "(" + k + ") ");
				}
			}
			if(n != 1 && IntegerNumber.isPrimeNumber(n)) System.out.print(n + "(" + 1 + ") ");
			System.out.println();
		}		
	}	
}