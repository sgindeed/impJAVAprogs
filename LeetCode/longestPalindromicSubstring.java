class Solution {
    public String longestPalindrome(String s) {
        if(s=="" || s.length() < 1)
            return "";
        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++)
        {
            int length1 = expand(s,i,i);
            int length2 = expand(s,i,i+1);
            int length = Math.max(length1, length2);
            if(length > end-start)
            {
                start = i - ((length-1)/2);
                end = i + (length/2);
            }
        }
            return s.substring(start, end+1);
    }
    public int expand(String s, int left, int right)
    {
        if(s == null && left < right)
            return 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}
