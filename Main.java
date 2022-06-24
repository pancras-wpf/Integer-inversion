package 整数反转;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = solution.reverse(1534);
        System.out.println(x);
    }
}

class Solution {
    public int reverse(int x) {
        int flag = 1;
        int y = 0;
        if(x< 0){
            flag = -1;
        }

        String s = "" + x*flag;

        for (int i = 0; i < s.length(); i++) {

            try {
                y = Math.addExact(y,(int)((s.charAt(i)-48) * Math.pow(10,i)));
            } catch (ArithmeticException aex) {
                return 0;
            }

        }
        y *= flag;
        return y;
    }
}