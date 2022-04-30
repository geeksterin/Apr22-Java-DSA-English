public class Main {
    public static void main(String[] args) {
        // 1. WAP given length , breadth of rectangle, check if square or not.    
        // Scanner scn = new Scanner(System.in);
        // int length = scn.nextInt();
        // int breadth = scn.nextInt();
        // if(length == breadth){
        //     System.out.println("Rectangle is Square");
        // } else {
        //     System.out.println("Rectangle is not Square");
        // }
        
        // 2. WAP to find greater among three integers.
//         Scanner scn = new Scanner(System.in);
//         int length = scn.nextInt();
//         int breadth = scn.nextInt();
//         int height = scn.nextInt();
        
//         if(length > breadth && length > height){
//             System.out.println("length is Maximum ");
//         } else if(breadth > length && breadth > height){
//             System.out.println("breadth is Maximum");
//         } else if(height > length && height > breadth){
//             System.out.println("height is Maximum");
//         } else if(length == breadth && length == height){
//             System.out.println("All three values are greatest");
//         } else if(length == breadth && length > height){
//             System.out.println("Both length and breadth are greatest");
//         } else if(length == height && length > breadth){
//             System.out.println("Length and height will be maximum");
//         } else if(breadth == height && breadth > length){
//             System.out.println("Breadth and Height are maximum");
//         }
        
        // 'a' to 'z' and 'A' to 'Z'
        // 3. WAP to check if uppercase or lowercase letter
            // 1st Method - By ASCII Values
            // 2nd Method - By Character Comparison Itself
        // Scanner scn = new Scanner(System.in);
        // char letter = scn.next().charAt(0);
        
        // if(letter >= 'A' && letter <= 'Z'){
        //     System.out.println(letter + " is Uppercase");
        // } else if(letter >= 'a' && letter <= 'z'){
        //     System.out.println(letter + " is Lowercase");
        // } else {
        //     System.out.println("You have inputed a wrong character");
        // }
        
        // if(letter >= 65 && letter <= 90){
        //     System.out.println(letter + " is Uppercase");
        // } else if(letter >= 97 && letter <= 122){
        //     System.out.println(letter + " is Lowercase");
        // } else {
        //     System.out.println("You have inputed a wrong character");
        // }
        
        // 4. WAP to input hour(24 hour format) and print 
        // good morning(<12) / good afternoon(<=16) 
        // / good evening(<=20) / good night.
        // HomeWork
        
        // 5. WAP to print A-Z, or 0-9
//         for(int i=0; i<=9; i++){
//             System.out.println(i);
//         }
        
//         for(char ch='0'; ch<='9'; ch++){
//             System.out.println(ch - 0);
//         }
        
//         for(char ch='A'; ch<='Z'; ch++){
//             System.out.println(ch);
//         }
        
        // 6. WAP to print even numbers till n. 
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // for(int i=0; i<=n; i=i+2){
        //     System.out.println(i);
        // }
        
        // 7. WAP to print all multiples of 7 till n
        // - There are 2 Ways
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=0; i<=n; i=i+7){
//             System.out.println(i);
//         }
        
//         for(int i=0; 7*i<=n; i++){
//             System.out.println(7 * i);
//         }
        
        // 8. WAP to count multiples of 3, multiples of 5 and both 3,5 in range 1-n.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // Output:
        // Multiples of 3: 3, 6, 9, 12 ,15 ,18, 21, 24, 27, 30, 33, 36, 39
        // Multiples of 5: 5, 10, 15, 20, 25, 30, 35, 40
        // Multiples of 3 & 5: 15, 30 
        int countof3 = 0;
        int countof5 = 0;
        int countof3and5 = 0;
        
        for(int i=1; i<=n; i++){
            if(i % 3 == 0){
                countof3++;
            } 
            if(i % 5 == 0){
                countof5++;
            }
            if(i % 3 == 0 && i % 5 == 0){
                countof3and5++;
            }
        }
        
        System.out.println(countof3 + " " + countof5 + " " + countof3and5);
        
        // 9. WAP to check if number is prime or not 
        // <-> O(N) method
        
        
        // 10. WAP to input n, loop for n times and input 2 numbers in each iteration
        // If iteration is even(0th,2nd,4th..) print sum else print multplication. (Homework)
        
        
        // Concept - Nested For Loops
        
        
        // 11. Target Sum Pair - O(N ^ 2)
        
    }
}
