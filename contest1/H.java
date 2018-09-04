import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;


public class H {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int test = input.nextInt();
		int x = 1;
		while (test-- > 0){
			long n = input.nextLong();
			Map<Long, Long> map = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				long a = input.nextLong();
				if(IntegerNumber.isPrimeNumber(a)){
					if(map.containsKey(a)){
						map.replace(a, map.get(a) + 1);
					}
					else map.put(a, 1L);
				}
			}
			System.out.println("Test " + x++ + ":");
			for (Map.Entry<Long, Long> entry: map.entrySet()) {
				System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
			}
		}	

	}	
}