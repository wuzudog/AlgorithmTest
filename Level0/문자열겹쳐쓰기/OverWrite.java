package Level0.문자열겹쳐쓰기;

// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_
// string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

public class OverWrite {
    public static void main(String[] args) {
        Solution so = new Solution();
//        String my_string = "He11oWor1d";
        String my_string = "Program29b8UYP";
//        String overwrite_string = "lloWorl";
        String overwrite_string = "merS123";
//        int s = 2;
        int s = 7;
        System.out.println(so.solution(my_string,overwrite_string,s));
    }
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String word = my_string.substring(0, s);
        String wordEnd = my_string.substring(s+overwrite_string.length());
        answer = word + overwrite_string + wordEnd;

        return answer;
    }
}