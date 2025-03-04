import java.util.Arrays;

/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 */

public class LArray27_re {
    public static void main(String[] args) {
        int result = LArray27_re.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);

        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                // 뒤쪽에서 값 하나를 가져와 교환
                nums[left] = nums[right];
                right--;
            } else {
                // val이 아니면 그냥 다음 원소로
                left++;
            }
        }

        return left;
    }

}
