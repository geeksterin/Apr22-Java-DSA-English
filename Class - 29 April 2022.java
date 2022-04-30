public class Main {
    public static void main(String[] args) {
        // Two Pointer Technique
        
//         1. Reverse an array using two pointers
//               a. Explain the concept of two pointers
//               b. Use while loop  

        
//         2. Sort 0-1
//                a. Brutefore sort
//                b. Two pointers and swap
// class Solution{   

//     public void segregate0and1(int arr[], int n) {
//         int start = 0, end = n - 1;
//         while(start < end){
            
//             // Skip All the 0s in left
//             while(start < end && arr[start] == 0)
//                 start++;
                
//             // Skip All the 1s in right
//             while(start < end && arr[end] == 1)
//                 end--;
                
//             if(start < end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++; end--;
//             }
            
//         }
//     }
// };
        
//         3. Sort by parity (Evens first then odds)
//                a. Similar to previous
// class Solution {
//     public int[] sortArrayByParity(int[] arr) {
//         int n = arr.length;
//         int start = 0, end = n - 1;
//         while(start < end){
            
//             // Skip All the evens in left
//             while(start < end && arr[start] % 2 == 0)
//                 start++;
                
//             // Skip All the odd in right
//             while(start < end && arr[end] % 2 == 1)
//                 end--;
                
//             if(start < end){
//                 // Bring Even to the left and Odd to the right
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++; end--;
//             }
            
//         }
        
//         return arr;
//     }
// }

//         4. Sort 0-1-2.
//                a. Use three pointers
    }
}
