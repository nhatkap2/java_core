import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class V {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scan.nextInt();
		scan.nextLine();
		while(test-- > 0){
			String a = scan.nextLine();
			String b = scan.nextLine();
			a = a.trim(); b = b.trim();
			Set<String> sa = new HashSet<>();
			sa.addAll(Arrays.asList(a.split("\\s+")));
			Set<String> sb = new HashSet<>();
			sb.addAll(Arrays.asList(b.split("\\s+")));
			Set<String> intersection = new HashSet<>(sa);
			intersection.retainAll(sb);
			sa.removeAll(intersection);
			for (String s : sa) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}