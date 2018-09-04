import java.util.Scanner;

public class X {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		scan.nextLine();
		int k = 1;
		while(test-- > 0){
			String str = scan.nextLine();
			String key = scan.nextLine();
			str.trim();
			String[] s = str.split("\\s+");
			System.out.print("Test " + k++ + ": ");
			for (String a : s) {
				if(!a.equalsIgnoreCase(key)) System.out.print(a + " ");
 			}
 			System.out.println();
		}
	}
}