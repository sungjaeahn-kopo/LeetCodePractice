import java.util.HashMap;
import java.util.Map;

/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 */

public class LArray35_re {
    public static void main(String[] args) {
        int result = LArray35_re.searchInsert(new int[] {1, 3, 5, 6}, 7);

        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
                System.out.println("left = " + left);
            } else {
                right = mid;
                System.out.println("right = " + right);
            }
            System.out.println("left + \" \" + right = " + left + " " + right);
        }
        
        return left;
    }

}
