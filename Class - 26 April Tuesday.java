public class Main {
//     public static void swap(int a, int b){
//         System.out.println(a + " " + b);
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a + " " + b);
//     }
    
    public static void main(String[] args) {
        // int x = 5, int y = 10;
        // System.out.println(x + " " + y);
        // swap(x, y);
        // System.out.println(x + " " + y);
        
        // 1D Array Concept
        // 1. Need of Arrays: Collection of "Similar" Datatype
        
        // So Many Variables
        // int marksOfRamesh = 93;
        // int marksOfRam = 83;
        // int marksOfShyam = 73;
        // int marksOfArchit = 63;
        // int marksOfAnil = 54;
        // int markOfVishal = 43;
        // int marksOfGogu = 33;
        // double averageOfDrishti = 50.0; 
        // You cannot store averageOfDrishti in the same array as marks of Students
        
        // Better Representation
        
        // 2. Syntax (Declaration & Initialization)
//         int[] marks = new int[7];
        
//         Scanner scn = new Scanner(System.in);
//         marks[0] = scn.nextInt();
//         marks[1] = scn.nextInt();
//         marks[2] = scn.nextInt();
//         marks[3] = scn.nextInt();
//         marks[4] = scn.nextInt();
//         marks[5] = scn.nextInt();
//         marks[6] = scn.nextInt();
        
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         System.out.println(marks[3]);
//         System.out.println(marks[4]);
//         System.out.println(marks[5]);
//         System.out.println(marks[6]);
        
        // String nameOf0 = "Archit";
        // String nameOf1 = "Umesh";
        // String nameOf2 = "Sudhakar";
        // String nameOf3 = "Sushant";
        
//         String[] names = new String[5];
//         names[0] = "Archit";
//         names[1] = "Umesh";
//         names[2] = "Sudhakar";
//         names[3] = "Sushant";
//         names[4] = "Shishpal";
//         System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4]);
        
//         Scanner scn = new Scanner(System.in);
//         int noOfStudents = scn.nextInt();
//         int[] marks = new int[noOfStudents]; 
//         // Size is fixed in Arrays -> Static Memory or Fixed Memory Allocation
        
//         for(int i=0; i<noOfStudents; i++){
//             marks[i] = scn.nextInt();
//         }
        
//         // Looping on Array
//         for(int i=0; i<noOfStudents; i++){
//             System.out.println(marks[i]);
//         }
        
        // 3. Memory Mapping (Contiguous Allocation)
        //    3.1 Stack vs Heap
        //    3.2 Primitive Datatypes vs Reference Variables
        //    3.3 Use of new Operator (Heap Memory Allocation)
        //    3.4 Contiguous Memory Allocation
        //    3.5 Default Value without new Operator of Reference
        
        // 4. Indexing Formula, Base Address, Block Address
        // 5. Why Array Requires Datatype (Similar Type of Data)
        // 6. Fixed Size (Length Parameter) - No Insertion or Deletion Possible
        // 7. Examples - Marks, Temperatures, Heights, etc.
        
        // 8. Functions & Arrays
        //     8.1 Passing Primitives to Functions 
        //     8.2 Passing References or Array to Functions
        //     8.3 Swap Primitives vs Swap Array Elements
        //     8.4 Concept - Stack Changes VS Heap Changes
        //     8.5 Return References or Array from Functions
        
        // Programs
        // - WAP to take input of an array and find sum
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i] = scn.nextInt();
//         }
        
        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);
        
        // - WAP to count evens in array - (HomeWork)
        
        // - WAP to find first occurence of an element - (Linear search)
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
        
//         for(int i=0; i<n; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         int target = scn.nextInt();
//         boolean isThereAnyTarget = false;
        
//         for(int i=0; i<n; i++){
//             if(arr[i] == target){
//                 System.out.println("Element Found at Index : " + i);
//                 isThereAnyTarget = true;
//             }
//         }
        
//         if(isThereAnyTarget == false){
//             System.out.println("Element is not Found");
//         }
        
        // - WAP to find largest in an array
        //   - Corner Cases
//         int largest = Integer.MIN_VALUE; // - Infinity (-2^31)
//         if(n == 0){
//             System.out.println("There are no elements");
//             return;
//         }
        
//         for(int i=0; i<n; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         System.out.println(largest);
        
        // 2nd Largest Element in Array
        // Scanner scn = new Scanner(System.in);
        // int[] arr = new int[n];
        // int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     if(arr[i] > largest){
        //         secondLargest = largest;
        //         largest = arr[i];
        //     } else if(arr[i] > secondLargest){
        //         secondLargest = arr[i];
        //     }
        // }
        
        // - WAP to check if array has any duplicate - Brute Force
//             6
//             10 30 20 50 10 40
//             -> 10

//             6
//             10 30 20 10 30 10
//             -> 10 30 

//             6
//             10 20 30 40 50 60
//             -> No Duplicates Present
        
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
        
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         for(int i=0; i<n; i++){
//             boolean isDuplicate = false;
//             for(int j=i+1; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     isDuplicate = true;
//                 }
//             }
//             if(isDuplicate == true) 
//                 System.out.println(arr[i] + " is also present after " + i);
//             else System.out.println(arr[i] + " is not present after " + i);
//         }
        
        // - WAP reverse an array
        // [10, 20, 30, 40 , 50] -> [50, 40, 30, 20, 10];
        // [10, 20, 30, 40, 50, 60] -> [60, 50, 40, 30, 20, 10];
        // [30, 10, 40, 20] -> [20, 40, 10, 30]
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
        
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         int start = 0, end = n-1;
//         while(start < end){
//             // Swap Elements at arr[start] and arr[end]
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++; end--;
//         }
        
//         for(int i=0; i<n; i++){
//             System.out.println(arr[i]);
//         }
        
        // - WAP bubble sort
        // [30, 10, 70, 40, 20, 50, 60] -> [10, 20, 30, 40, 50, 60, 70]
        
        
        // - WAP to create array where arr[i] is i'th fibonacci
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         System.out.println(fib(n));
        
//         int first = 0, second = 1, third = first + second;
//         System.out.println(first);
//         System.out.println(second);
        
//         for(int count=3; count<=n; count++){
//             System.out.println(third);
//             first = second;
//             second = third;
//             third = first + second;
//         }
        
        // - WAP to create array where arr[i] factorial of i.
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        
//         // Calculate val! for every value of val
//         for(int val=1; val<=n; val++){
            
//             // Calculate val!
//             int fact = 1;
//             for(int i=1; i<=val; i++){
//                 fact = fact * i;
//             }
            
//             System.out.println(fact);
//         }
        
//         int fact = 1;
//         for(int idx=0; idx<n; idx++){
//             fact = fact * (idx + 1);
//             arr[idx] = fact;
//         }
        
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
    }
}
