import java.util.Scanner;

public class Y {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt(); scan.nextLine();
		while(test-- > 0){
			String str = scan.nextLine();
			str += " "; // đánh dấu hết dãy
			long res = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				if(romaToInt(str.charAt(i)) >= romaToInt(str.charAt(i + 1))){
					res += romaToInt(str.charAt(i));
				}
				else{
					res += (romaToInt(str.charAt(i + 1)) - romaToInt(str.charAt(i)));
					i++;
				}
			}
			System.out.println(res);
		}
	}
	public static int romaToInt(char c){
		if(c == 'I') return 1;
		if(c == 'V') return 5;
		if(c == 'X') return 10;
		if(c == 'L') return 50;
		if(c == 'C') return 100;
		if(c == 'D') return 500;
		if(c == 'M') return 1000;
		return 0;
	}
}