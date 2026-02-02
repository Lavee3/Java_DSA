class Solution {
    public int missingNumber(int[] nums) {
     int a = nums.length; 
     int b = a*(a+1)/2; 

     int arr_sum= 0; 
      for(int i = 0; i<a; i++)
      {
        arr_sum= arr_sum+nums[i];
      }
      return b-arr_sum; 
    }
}
