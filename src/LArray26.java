/**
 * Two Pointers
 * 새로운 배열을 사용하지 않고, 기존 배열에서 중복 제거
 */

public class LArray26 {
    public static void main(String[] args) {
        int result = LArray26.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});

        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // 예외 처리

        int pointerOne = 0;  // 중복 없는 요소 저장 위치
        int pointerTwo = 1;  // 탐색 포인터

        while (pointerTwo < nums.length) {
            if (nums[pointerOne] != nums[pointerTwo]) {
                pointerOne++;
                nums[pointerOne] = nums[pointerTwo]; // 중복 없는 값 저장
            }
            pointerTwo++;  // 탐색 포인터 이동
        }

        return pointerOne + 1; // 유니크한 개수 반환
    }

}
