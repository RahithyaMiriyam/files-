public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; 
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = new Solution().plusOne(digits); 

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
