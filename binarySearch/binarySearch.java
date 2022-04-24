//  https://leetcode.com/problems/binary-search/

public class binarySearch {
   public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = -4;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}