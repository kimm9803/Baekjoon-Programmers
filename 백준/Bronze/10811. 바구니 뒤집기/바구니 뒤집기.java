import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n+1];
        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }

        int a;
        int b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            list = new ArrayList<>();

            for (int j = a; j <= b; j++) {
                list.add(basket[j]);
            }
            int x = b-a;
            for (int j = a; j <= b; j++) {
                basket[j] = list.get(x);
                x--;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}

