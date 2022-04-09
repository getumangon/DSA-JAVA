//  https://leetcode.com/problems/valid-perfect-square/

public class isPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;


        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;

            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
