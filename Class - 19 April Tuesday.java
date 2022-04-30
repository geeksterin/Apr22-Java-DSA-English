public class Main {
    public static void main(String[] args) {
        // Homework: Write a Program to Check if a No is Prime or Not
        // If any integer b/w 1 and n (both exclusive) will give remainder 0
        // then we are sure number is not prime.
        
        // There is no factor other than 1 and n, then we can say n is prime
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                System.out.println(n + " is composite");
                return;
            }
        }
        
        System.out.println(n + " is a prime");
        
        // Concept: Nested For Loops
        // for(int box=1; box<=5; box++){
        //     System.out.println(box + " - ");
        //     for(int ball=1; ball<=5; ball++){
        //         System.out.println("Box : " + box + " , Ball : " + ball);
        //     }
        // }
        
        // 1. WAP to print elements from 1 to n*m where rows and columns
                // Rows  = 5
                // Cols = 4
                // 1 2 3 4
                // 5 6 7 8
                // 9 10 11 12
                // 13 14 15 16
                // 17 18 19 20
        
//         Scanner scn = new Scanner(System.in);
//         int rows = scn.nextInt();
//         int cols = scn.nextInt();
//         int idx = 1;
        
//         for(int row=1; row<=rows; row++){
//             for(int col=1; col<=cols; col++){
//                 System.out.print(idx + " ");
//                 idx++;
//             }
//             System.out.println();
//         }
            
        // 2. WAP to count number of pairs in 1-n with sum even.
                // 1 2
                // 1 3
                // 1 4
                // 1 5
        
                // 2 3
                // 2 4
                // 2 5
        
                // 3 4
                // 3 5
        
                // 4 5
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if((i + j) % 2 == 0){
                    // Upper Right Triangle
                    System.out.println(i + " " + j);
                }
            }
        }
        
        // Homework:
        // 3. WAP to find number of pairs with given sum. - O(N^2) Approach
        
        
        // Pattern 1 (Bottom-Left):
              // *
              // **
              // ***
              // ****
              // *****
        
        
        // Pattern 2 (Upper-Left):
              // ***** 
              // **** 
              // *** 
              // ** 
              // * 
        
        //

        // Pattern 3:
               // 1
               // 1 2
               // 1 2 3
               // 1 2 3 4

        
        // Pattern 4 : (Bottom Right)
               //      *
               //     **
               //    ***
               //   ****
               //  *****
               // ******
        
        // Pattern 5: (Homework)
            //     *
            //    ***
            //   *****
            //  *******
            // *********
    
    }
}
