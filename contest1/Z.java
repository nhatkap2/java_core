import java.util.Scanner;
import java.lang.StringBuilder;


public class Z {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while(n != 0){
			String a = scan.nextLine();
			String b = scan.nextLine();
			String key = scan.nextLine();
			StringBuilder s = new StringBuilder(a + b);
			String cs = a + b;
			int k = 0;
			while(!s.toString().equalsIgnoreCase(key)){
				for(int i = 0; i < a.length(); i++){
					s.setCharAt(i * 2, b.charAt(i));
					s.setCharAt(i * 2 + 1, a.charAt(i));
				}
				k++;
				a = s.substring(0, a.length());
				b = s.substring(a.length(), s.length());
				if(s.toString().equalsIgnoreCase(cs)){
					k = -1;
					break;
				}
			}
			System.out.println(k);
			n = Integer.parseInt(scan.nextLine());
		}
	}	
}