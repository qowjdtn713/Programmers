import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        // 배열을 리스트로 변환
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        
        // 리스트를 오름차순으로 정렬
        Collections.sort(list);

        // 가장 작은 5개 제외한 나머지 리스트 반환
        return list.subList(5, list.size());
    }
}