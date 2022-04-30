import java.util.*;
import java.io.*;

public class Class3 {
    public static void main(String[] args) {

        // int age = scn.nextInt();
        // int marks = scn.nextInt();

        // // Logical Operators
        // // AND operator
        // // Student is Adult AND he will get 'O' Grade
        // System.out.println(age >= 18 && marks >= 92);

        // Scanner scn = new Scanner(System.in);
        // // Take the gender (M or F) input in char
        // char gender = scn.next().charAt(0);
        // // Take the integer marks
        // int marks = scn.nextInt();
        // // Student is a male AND he is getting 'O' grade
        // System.out.println(gender == 'M' && marks >= 92);

        // // // OR operator
        // // Student is Adult OR he will get 'O' grade
        // System.out.println(age >= 18 || marks >= 92);

        // Student is Female or student is getting failed
        // Scanner scn = new Scanner(System.in);
        // char gender = scn.next().charAt(0);
        // int marks = scn.nextInt();
        // System.out.println(gender == 'F' || marks <= 33);

        // // NOT operator -> only 1 operand (statement) is required
        // Scanner scn = new Scanner(System.in);
        // // int marks = scn.nextInt();
        // // System.out.println(!(marks >= 33));

        // int age = scn.nextInt();

        // // if(age >= 18)
        // // System.out.println("You are allowed to drink alcohol");
        // // else
        // // System.out.println("You have to drink milk only");

        // if(age >= 18){
        // System.out.println("You can drink alcohol");
        // System.out.println("You can be married");
        // } else {
        // System.out.println("you have to drink milk");
        // System.out.println("You have to wait for the marriage");

        // If 2 is a factor of power (power is an even no),
        // then you can join avengers
        // else you should wait and watch.
        Scanner scn = new Scanner(System.in);
        int power = scn.nextInt();
        if (power % 2 == 0) {
            System.out.println("You can join avengers");
        } else {
            System.out.println("you should wait and watch");
        }

        // Homework: If Student is Adult AND Power is Divisible by 4
        // Then Print "He is a Young Avenger";
        // Else Print "He is too Young";
    }
}
