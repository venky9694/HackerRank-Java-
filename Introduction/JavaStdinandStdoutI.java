/*
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
