import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == 'c') {
                if (i+1 < str.length() && str.charAt(i+1) == '=') {   // 'c='
                    count++;
                    i += 1;
                } else if (i+1 < str.length() && str.charAt(i+1) == '-') {    // 'c-'
                    count++;
                    i += 1;
                } else {
                    count++;
                }
            } else if (c == 'd') {
                if (i+1 < str.length() && str.charAt(i+1) == '-') {     // 'd-'
                    count++;
                    i += 1;
                } else if (i+2 < str.length() && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {    // 'dz='
                    count++;
                    i += 2;
                } else {
                    count++;
                }
            } else if (c == 'l') {
                if (i+1 < str.length() && str.charAt(i+1) == 'j') {   // 'lj'
                    count++;
                    i += 1;
                } else {
                    count++;
                }
            } else if (c == 'n') {
                if (i+1 < str.length() && str.charAt(i+1) == 'j') {     // 'nj'
                    count++;
                    i += 1;
                } else {
                    count++;
                }
            } else if (c == 's') {
                if (i+1 < str.length() && str.charAt(i+1) == '=') {     // 's='
                    count++;
                    i += 1;
                } else {
                    count++;
                }
            } else if (c == 'z') {
                if (i+1 < str.length() && str.charAt(i+1) == '=') {     // 'z='
                    count++;
                    i += 1;
                } else {
                    count++;
                }
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}