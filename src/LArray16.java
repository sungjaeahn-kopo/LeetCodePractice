import java.util.ArrayList;
import java.util.List;

/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 *
 * Idea
 * 가장 가까운 합 >> 절댓값 비교
 */

public class LArray16 {
    public static void main(String[] args) {
        int result = LArray16.threeSumClosest(new int[] {-1,2,1,-4}, 1);

        System.out.println(result);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closeSum = nums[0] + nums[1] + nums[2];
        int length = nums.length;

        for (int i = 0; i < length - 2; i++) {
            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // 가까운지 체크
                if (Math.abs(currentSum - target) < Math.abs(closeSum - target)) {
                    closeSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }

        return closeSum;
    }

}
