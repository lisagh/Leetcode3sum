public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length<3)
        return result;
        
        Arrays.sort(nums);
        
        for (int i = 0; i <= nums.length - 3; i ++){
            if ( i == 0 || nums[i] > nums[ i - 1]){
              int start = i + 1;  
              int end = nums.length -1;
              while( start < end) {
                  if ( nums[i] + nums[start] + nums[end] == 0){
                      List<Integer> l = new ArrayList<Integer>();
                      l.add(nums[i]);
                      l.add(nums[start]);
                      l.add(nums[end]);
                      result.add(l);
                  }
                   if ( nums[i] + nums[start] + nums[end] < 0){
                      int newstart = start;
                      while (nums[start] == nums[newstart] && start < end){
                          start++;
                      }
                   }
                      else{
                        int newend = end;
                      while (nums[end] == nums[newend] && start < end){
                          end--;
                      }
                  }
                  
              }
            }
            
            
        }
        return result;
    }
}