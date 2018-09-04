import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class W {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt(); scan.nextLine();
		Set<String>  res = new LinkedHashSet<>(); // LHS giữ được vị trí add vào
		while(test-- > 0){
			String str = scan.nextLine();
			str = str.toLowerCase();
			str.trim();
			String[] s = str.split("\\s+");
			String x = s[s.length - 1];
			for (int i = 0; i < s.length - 1; i++) {
				if(s[i].length() == 0) continue;
				x = x + s[i].charAt(0);
			}
			if(!res.contains(x)){
				res.add(x);
				continue;
			}
			int k = 2;
			String tmp = x + 2;
			while(true){
				if(res.contains(tmp)) {
					k++;
					tmp = x + k;
				}
				else {
					res.add(tmp);
					break;
				}
			}
		}
		for (String a : res) {
			System.out.println(a + "@ptit.edu.vn");
		}
	}
}