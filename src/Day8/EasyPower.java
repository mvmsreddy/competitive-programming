package Day8;

import java.util.Scanner;

public class EasyPower {
//    Problem Description
//
//    You are given two integers A and B. You have to find the value of AB.
//
//    NOTE: The value of answer is always less than or equal to 109.
//
//
//
//    Problem Constraints
//
//      1 <= A, B <= 1000

//    Input Format
//
//    First line of the input contains a single integer A.
//
//    Second line of the input contains a single integer B.
//
//
//
//    Output Format
//
//    Print a single integer in single line.
//
//
//
//            Example Input
//
//    Input 1:
//
//            2
//            3
//    Input 2:
//
//            1
//            10
//
//
//    Example Output
//
//    Output 1:
//
//            8
//    Output 2:
//
//            1
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    For A = 2 and B = 3, the value of 23 = 2 * 2 * 2 = 8.
//    Explanation 2:
//
//    For A = 1 and B = 10, the value of 110 = 1.

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();


        long result = 1;

        for (int exponent = B; exponent != 0; --exponent) {
            result *= A;
        }

        System.out.println(result);
    }
}
