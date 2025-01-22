public class Solution {
    public int solution(int a, int b) {
        // a ⊕ b와 b ⊕ a를 문자열로 붙인 후 정수로 변환
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        
        // 더 큰 값을 반환, 같으면 ab 반환
        return Math.max(ab, ba);
    }
}