package leetcode.editor.cn;
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
//
// Related Topics 数学 👍 2153 👎 0

public class PalindromeNumber{
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
        System.out.println(solution.isPalindrome(1212));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        return true;
    }

    public boolean useStringBuilderApi(int x) {
        // 方案一：使用StringBuilder API
        if (x < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String X = sb.toString();
        String newX = sb.reverse().toString();
        return X.equals(newX);
    }

    public boolean useString(int x) {
        // 方案二：先转为String，左右遍历比较
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int len = s.length();
        for(int i = 0, j = len - 1; i <= j; i++,j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}

