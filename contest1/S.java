import java.util.*;
public class S{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        int test = scan.nextInt(); scan.nextLine();
        while (test-- > 0){
            String s = scan.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(s, " ");
            System.out.println(tokenizer.countTokens());
        }
    }
}