class Solution {
    public double power(double x, long n)
    {
        if(n==0)
            return 1.0;
        if(n==1)
            return x;
        if(n<0)
            return power(1/x, -n);
        double result = power(x, n/2);
        result = result * result;
        if(n%2 == 1)
            result = result*x;
        return result;
    }
    public double myPow(double x, int n) {
       return power(x,n);
    }
}
