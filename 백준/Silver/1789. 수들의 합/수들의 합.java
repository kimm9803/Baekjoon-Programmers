import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        int count = 0;
        long sum = 0;
        int i = 1;
        while(true) {
            if (sum > s) {
                break;
            }
            sum += i;
            i++;
            count++;
        }
        System.out.println(count - 1);
    }
}