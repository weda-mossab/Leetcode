// class Solution {

//     public static void main(String[] args) {
//     int nums[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
//     int temp[] = new int[nums.length];
//     int j = 0;
//     int addIndex=0;

//     for(int i = 0; i < nums.length - 1; i++) {
//         if(nums[i] != nums[i+1]) {
//         temp[j++] = nums[i]; 
//         addIndex++;
//         }
//     }
//     temp[j++] = nums[nums.length - 1];

//         for(int k = 0; k <j; k++) {
//             System.out.println(temp[k]);
//         }
//         System.out.println(addIndex);

//         }
// }

class Solution {

    public int removeDuplicates(int[] nums) {

    // int nums[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
    int temp[] = new int[nums.length];
    int j = 0;
    int addIndex=0;

    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] != nums[i+1]) {
        temp[j++] = nums[i]; 
        addIndex++;
        }
    }
    // temp[j++] = nums[nums.length - 1];

    //     for(int k = 0; k <j; k++) {
    //         System.out.println(temp[k]);
    //     }
        return addIndex;

        }
}

