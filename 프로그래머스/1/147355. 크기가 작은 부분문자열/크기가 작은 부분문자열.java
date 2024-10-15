class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long longP = Long.parseLong(p);
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String str = "";
            for (int j = i; j < i + p.length(); j++) {
                str += t.charAt(j);
            }
            if (Long.parseLong(str) <= longP) {
                answer++;
            }
        }
        return answer;
    }
}

/*
 *  for문 이용
 *  문자열 t에서 p의 길이만큼 부분 문자열을 만들어 p보다 작거나 같으면 answer++
*/