import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger zero = new BigInteger("0");
        for(int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int j = 0; j < n; j++) {
                BigInteger bigInteger = sc.nextBigInteger();
                sum = sum.add(bigInteger);
            }

            if(sum.compareTo(zero) == 0)
                System.out.println("0");
            else if(sum.compareTo(zero) == -1)
                System.out.println("-");
            else
                System.out.println("+");
        }
    }
}