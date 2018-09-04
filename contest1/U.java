import java.util.Scanner;

public class U {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = Integer.parseInt(scan.nextLine());
		while (test-- > 0){
			String s = scan.nextLine();
			s = s.toLowerCase();
			s = s.trim();
			String[] a = s.split("\\s+");
			for (int i = 1; i < a.length - 1; i++) {
				System.out.print(Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1, a[i].length()) + " ");
			}
			System.out.print(Character.toUpperCase(a[a.length - 1].charAt(0)) + a[a.length - 1].substring(1, a[a.length - 1].length()) + ", ");
			System.out.println(a[0].toUpperCase());
		}
	}
}