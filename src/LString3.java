import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 */

public class LString3 {
    public static void main(String[] args) {
        int result = LString3.lengthOfLongestSubstring("abcabcbb");

        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);

            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
