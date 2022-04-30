import java.util.*;
import java.io.*;

public class Class1 {
    public static void main(String[] args) {
        System.out.println("Hello World"); // Printing String Literal on Console in Java
        int marks1 = 10; // Datatypes and Variables
        int marks2 = 20;
        System.out.println(10 + 20); // Arithmetic Operations (+, -, /, *, %)
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(30 / 20); // Integer Divison { decimal places will get truncated }
        System.out.println(30.0 / 20); // Float Division
        System.out.println(30 / 20.0);
        System.out.println(30.0 / 20.0);
        System.out.println(30 % 20); // modulo operation -> Remainder of the division
        System.out.println(marks1 + marks2);

        Scanner scn = new Scanner(System.in); // Scanner Object
        int marks = scn.nextInt(); // Taking Integer Input in Java
        System.out.println(marks); // Printing Integer on Console in Java
    }
}
