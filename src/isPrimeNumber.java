import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();

    boolean flag = true;
        for(int i = 2; i<A;i++) {
        if (A % i == 0) {
            flag = false;
            break;
        }
    }
        if(flag ==true)
            System.out.print("YES");
        else
            System.out.print("NO");
}
}