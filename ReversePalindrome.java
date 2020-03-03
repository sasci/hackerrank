package hackerRank;
import java.io.*;
import java.util.*;

public class ReversePalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B=new StringBuilder(A);
        String reverseA=B.reverse().toString();
        System.out.println((A.equals(reverseA)) ? "Yes" : "No");   
    }
}