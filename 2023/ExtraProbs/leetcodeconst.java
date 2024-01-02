// class Solution {
//     public int maximumOr(int[] nums, int k) {
//         int maxBit = 0;
//         int res = 0;
//         int result = 0;

//         for (int n : nums) {
//             maxBit = Math.max(maxBit, Integer.numberOfLeadingZeros(n));
//         }

//         for (int i = 30; i >= 0; i--) {
//             if ((maxBit <= i) && ((result | (1 << i)) <= k)) {
//                 result |= (1 << i);
//             }
//         }
//         for (int n : nums) {
//             res |= (n << result);
//         }
//         return res;
//     }
// }

class Solution {
    public int sumOfPower(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

            }
        }
    }
}