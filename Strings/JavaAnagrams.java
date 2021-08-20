/*
@Authore :Venkatesh Kumawat
@Date :20 August 2021
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams.

*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       //converting into lowerCase
       a=a.toLowerCase();
       b=b.toLowerCase();
       
       if(a.length()==b.length())
       {
           int [] s1=new int[256];
           int [] s2=new int[256];
           
           //checking the frequency of the all the cases
           for(int i =0;i<b.length();i++)
           {
               s1[(int) a.charAt(i)]+=1;
               s2[(int) b.charAt(i)]+=1;
               
           }
           //checking the all the values wheter they are right or not
           
           for(int i=0;i<256;i++)
           {
               if(s1[i]!=s2[i])
               
               return false;
               
           }
           return true;
       }
       else
       {
           return false;
       }
       
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}







