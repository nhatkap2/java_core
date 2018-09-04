import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;


public class L {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Map<Integer, Integer> map = new LinkedHashMap<>();
		while (input.hasNextInt()){
			int a = input.nextInt();
			if(!IntegerNumber.isPalidromicNumber(a)) continue;
			if(map.containsKey(a)){
				map.replace(a, map.get(a) + 1);
			}
			else{
				map.put(a, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}	
}