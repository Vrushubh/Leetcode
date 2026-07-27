class Solution {
    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                first=nums[i];
                j=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second && nums[i]<=first){
                if(i!=j)second=nums[i];
            }
        }
        return ((first-1)*(second-1));
    }
}