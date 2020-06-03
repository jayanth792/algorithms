class Solution {
    public int[] sortArray(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }else{
                for(int j=i;j>=0;j--){
                    if(nums[j+1]<nums[j]){
                        int temp = nums[j+1];
                        nums[j+1] =nums[j];
                        nums[j]= temp;
                    }
                }
            }
        }
        return nums;
    }
    
}
