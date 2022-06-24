package 整数反转;

class Solution2 {
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int temp = res * 10 + x % 10;
            x /= 10;
            if (temp / 10 != res) {
                return 0;
            }
            res = temp;
        }
        return res;
    }
}