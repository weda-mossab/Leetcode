class Solution {
    public int[] twoSum(int[] nums, int target) {
        //example : nums = [2,7,11,15], target = 9
        Map<Integer,Integer> Map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){ 
            if (Map.containsKey(target -  nums[i])) { // if map contains the value = target - nums[i] ==> 9-2 = 7
                return new int[] {Map.get(target -  nums[i]) ,i}; // nums = [Map.get(target -  nums[i]) = 0 , i=1 ]
            }
            else { // Map.put(K key, V value)
            Map.put(nums[i] , i);  
            }
         }
         return null;
        }
}