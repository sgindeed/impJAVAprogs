class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        int n=s.length();
        int p=t.length();
       
        if(n!=p)
            return false;

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(m.containsKey(ch)==false)
                m.put(ch,1);
            else
                m.put(ch,m.get(ch)+1);
        }

        for(int i=0;i<p;i++)
        {
            char ch= t.charAt(i);
            if(m.containsKey(ch)==false)
            {
                return false;
            }
            if(m.get(ch)==1)
            {  
              m.remove(ch);
            }
            else
            {
                m.put(ch, m.get(ch)-1);
            }
           
        }
    return true;
    }   
}
