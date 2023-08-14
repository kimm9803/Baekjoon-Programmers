import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(polynomial, " ");
        List<String> list = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        
        int[] arr = new int[2]; // 피연산자를 저장할 배열
        Arrays.fill(arr, 0);    // 0번방에는 x, 1번방에는 상수

        String str;
        String x;
        for (int i = 0; i < list.size(); i+=2) {
            str = list.get(i);
            x = "";
            if (str.contains("x")) {
                if (str.equals("x")) {
                    arr[0] += 1;
                } else {
                    for (int j = 0; j < str.length()-1; j++) {
                        x += str.charAt(j);
                    }
                    arr[0] += Integer.parseInt(x);
                }
            } else {
                arr[1] += Integer.parseInt(str);
            }
        }
        if (arr[0] == 0) {
            answer += arr[1];
        } else if (arr[1] == 0 && arr[0] == 1) {
            answer = "x";
        } else if (arr[0] == 1) {
            answer = "x" + " + " + arr[1];
        } else if (arr[1] == 0) {
            answer = arr[0] + "x";
        } else {
            answer = arr[0] + "x" + " + " + arr[1];
        }
        
        return answer;
    }
}