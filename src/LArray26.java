/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 */

public class LArray26 {
    public static void main(String[] args) {
        int result = LArray26.removeDuplicates(new int[] {1,1,2});

        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueCount = 0;
        int pointerOne = 0;
        int pointerTwo = pointerOne + 1;

        while(pointerOne < pointerTwo) {
            if (nums[pointerOne] == nums[pointerTwo]) {
                pointerTwo++;
            } else {
                uniqueCount++;
                nums[pointerOne + 1] = nums[pointerTwo];
                if (pointerTwo != nums.length - 1) {
                    pointerOne++;
                    pointerTwo++;
                }
            }
        }

        // for (int e : nums) {
        //     System.out.println(e);
        // }

        return uniqueCount;
    }
}
