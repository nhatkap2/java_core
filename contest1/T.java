import java.util.Scanner;

public class T {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt(); scan.nextLine();
		while (test-- > 0){
			String s = scan.nextLine();
			if(checkBeautifulNumber(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	public static boolean checkBeautifulNumber(String s){
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '0' && s.charAt(i) != '2' && s.charAt(i) != '4' &&
				s.charAt(i) != '6' && s.charAt(i) != '8') return false;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}
}