class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    str += Character.toUpperCase(arr[i].charAt(j));
                } else if (j % 2 == 1) {
                    str += Character.toLowerCase(arr[i].charAt(j));
                }
            }
            arr[i] = str;
        }
        
        String str2 = "";
        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i] + " ";
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            answer += str2.charAt(i);
        }
        return answer;
    }
}

/*
 *  각 단어를 공백 기준으로 나눠 배열 생성
 *  0, 2, ... 등 짝수번째는 대문자로
 *  1, 3, ... 등 홀수번째는 소문자로
 *  문자열 앞에 공백이 오거나 끝에 공백이 오는 반례 고민
*/