class Solution {
    public int reverse(int x) {
        int d, n=x;
        long rev = 0;
        if(x < 0)
            n=-1*n;
        while(n > 0 )
        {
            rev = rev*10 + x%10;
            n = n/10;
            x= x/10;
        }
        if(rev < Math.pow(-2, 31) || rev > Math.pow(2, 31))
            return 0;
        else
            return (int) rev;
    }
}
