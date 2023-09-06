class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water = 0;

    	int lMax[] = new int[n];
    	int rMax[] = new int[n];

    	lMax[0] = height[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = Math.max(height[i], lMax[i - 1]);


    	rMax[n - 1] = height[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = Math.max(height[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		water = water + (Math.min(lMax[i], rMax[i]) - height[i]);
    	
    	return water;
    }
}
