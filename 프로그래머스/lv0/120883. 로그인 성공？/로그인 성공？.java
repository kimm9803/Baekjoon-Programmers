class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int[] ch = new int[2];  // 체크 배열
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                ch[0] = 1;
            } else {
                ch[0] = 0;
            }
            
            if (id_pw[1].equals(db[i][1])) {
                ch[1] = 1;
            } else {
                ch[1] = 0;
            }
            // 체크 배열 탐색
            if (ch[0] == 1 && ch[1] == 1) {
                answer = "login";
                break;
            } else if (ch[0] == 1 && ch[1] == 0) {
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}