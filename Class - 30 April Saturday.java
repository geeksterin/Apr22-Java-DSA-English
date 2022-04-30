// "static void main" must be defined in a public class.
public class Main {
//     public void sortColors(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == 0) count0++;
//             else if(nums[i] == 1) count1++;
//             else count2++;
//         }
        
//         for(int i=0; i<nums.length; i++){
//             if(i < count0) nums[i] = 0;
//             else if(i < count0 + count1) nums[i] = 1;
//             else nums[i] = 2;
//         }
//     }
    
//     public void sortColors(int[] arr) {
//         int n = arr.length;
//         // Segregating 0s and Non Zeros
//         int start = 0, end = n - 1;
//         int countof0s = 0;
//         while(start <= end){
            
//             // Skip All the 0s in left
//             while(start <= end && arr[start] == 0){
//                 start++;
//                 countof0s++;
//             }
                
//             // Skip All the Non Zeros in right
//             while(start <= end && arr[end] != 0)
//                 end--;
                
//             if(start <= end){
//                 countof0s++;
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++; end--;
//             }
            
//         }
        
//         start = countof0s; end = n - 1;
//         while(start < end){
            
//             // Skip All the 1s in left
//             while(start < end && arr[start] == 1){
//                 start++;
//             }
                
//             // Skip All the 2s in right
//             while(start < end && arr[end] == 2)
//                 end--;
                
//             if(start < end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++; end--;
//             }
            
//         }
//     }
    public static void main(String[] args) {
        // Sort 012
        
    }
}
