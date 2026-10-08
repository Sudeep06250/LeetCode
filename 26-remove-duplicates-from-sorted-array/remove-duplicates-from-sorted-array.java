class Solution {
    public int removeDuplicates(int[] nums) {
      
       
       int i,j;
       i=0;
       for(j = 1;j<nums.length;j++){
        if(nums[j]!=nums[i]){
            nums[i+1] = nums[j];
            i++;
        }

       }
       return i+1;

        
       
    }
}