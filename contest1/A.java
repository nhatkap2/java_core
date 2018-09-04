import java.util.Scanner;

public class A {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int test = scan.nextInt();
        while(test-- != 0){
            long a = scan.nextLong();
            long b = scan.nextLong();
            if(a == 0 || b == 0) {
                System.out.println("0 0");
                continue;
            }
            long gcd = IntegerNumber.GCD(a, b);
            System.out.println(gcd + " " + a/gcd*b);
        }
    }
}