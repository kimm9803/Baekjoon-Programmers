class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean tr = false;
        int[] ch = new int[spell.length];
        
        loopout:
        for (int i = 0; i < dic.length; i++) {
            tr = false;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j]) == true) {
                    ch[j] = 1;
                } else {
                    ch[j] = 0;
                }
            }
            
            for (int j = 0; j < spell.length; j++) {
                if (ch[j] == 1) {
                    tr = true;
                } else if (ch[j] == 0) {
                    tr = false;
                    break;
                }
            }
            if (tr == true) {
                answer = 1;
                break loopout;
            }
        }
        if (answer == 1) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}