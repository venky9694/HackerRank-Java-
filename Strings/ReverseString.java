/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

Answer

*/

import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // StringBuilder B=new StringBuilder();
        // B.append(A);
        // B.reverse();
        String rev="";
        for(int i=(A.length()-1);i>=0;i--)
        {
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        
    }
}



