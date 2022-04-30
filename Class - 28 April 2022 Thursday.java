public class Main{
    public static void main(String[] args){
        // 1. WAP to find first and last occurence of a given element in an array.
        //    a. In two traversals.
        //    b. In one traversal.
        
        // Linear Search Algorithm
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        // int target = scn.nextInt();
        
        // Print All Occurences of Array -> Linear Search
//         int countOfOccurences = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 countOfOccurences++;
//                 System.out.print(i + " ");
//             } 
//         }
        
//         if(countOfOccurences == 0){
//             System.out.print(-1);
//         }
        
        // Printing the First Occurence
//         int countOfOccurences = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 countOfOccurences++;
//                 if(countOfOccurences == 1){
//                     System.out.print(i + " ");
//                 }
//             } 
//         }
        
//         if(countOfOccurences == 0){
//             System.out.print(-1);
//         }
        
        // Printing the Last Occurence
//         int countOfOccurences = 0;
//         for(int i=n-1; i>=0; i--){
//             if(arr[i] == target){
//                 countOfOccurences++;
//                 if(countOfOccurences == 1){
//                     System.out.print(i + " ");
//                 }
//             } 
//         }
        
//         if(countOfOccurences == 0){
//             System.out.print(-1);
//         }
        
        // First Occurence Using the Break Statement
//         int i = 0;
//         while(i < n) {
//             if(arr[i] == target){
//                 System.out.println(i);
//                  // Achieving Termination of Inner Most Loop without Actually 
//                 break; // Satisfying the terminating condition
//             }
            
//             i++;
//         }
        
//         if(i == n){
//             System.out.print(-1);
//         }
        
        // Last Occurence Using the Break Statement
//         int i = n - 1;
//         while(i >= 0) {
//             if(arr[i] == target){
//                 System.out.println(i);
//                  // Achieving Termination of Inner Most Loop without Actually 
//                 break; // Satisfying the terminating condition
//             }
            
//             i--;
//         }
        
//         if(i == -1){
//             System.out.print(-1);
//         }
        
        // First Occurence by Storing the value
//         int first = -1; 
//         // First will never get updated from -1 if target is not present
//         // thats why we are initializing with -1
        
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 first = i;
//                 break;
//             }
//         }
        
//         System.out.println(first);
        
        // Last Occurence by Storing the value
            // int last = -1;
            // for(int i=n-1; i>=0; i--){
            //     if(arr[i] == target){
            //         last = i;
            //         break;
            //     }
            // }
            // System.out.println(last);
        
        // First & Last Occurence in one single loop
//         int last = -1;
//         int first = -1;
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 if(first == -1){ 
//                     // Update First if it is Found only for the first time
//                     first = i;
//                 }
                
//                 last = i;
//             }
//         }
        
//         System.out.println(first + " " + last);
        
        // 2. WAP to find (Range) difference of 
        // maximum and minimum element in an array.
        
//         int minimum = Integer.MAX_VALUE;
//         // min(a, +Inf) = a
//         int maximum = Integer.MIN_VALUE;
//         // max(a, -Inf) = a
        
//         for(int i=0; i<n; i++){
//             if(arr[i] < minimum)
//                 minimum = arr[i];
//             if(arr[i] > maximum)
//                 maximum = arr[i];
//         }
        
//         System.out.println(maximum - minimum);
        
        // 3. WAP to count peak elements.
        // (Peak elements are those who have smaller 
        //  elements on immediate left and right).
        int peaks = 0;
        int valleys = 0;
        for(int i=1; i<n-1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                peaks++;
            }
            
            else if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1]){
                valleys++;
            }
        }
        System.out.println(peaks + " " + valleys);
        
        // 4. WAP to check if array is a mountain/bitonic array.(<<<>>>)
        // (Amazon, Facebook) Level Question
        if(peaks == 1 && valleys == 0){
            System.out.println("Array is Mountain");    
        } else {
            System.out.println("Array is not Mountain");
        }
    }
}
