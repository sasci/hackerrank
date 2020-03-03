package hackerRank;

import java.util.Scanner;

public class StringCompare {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     String A=sc.next();
     String B=sc.next();
     /* Enter your code here. Print output to STDOUT. */
     System.out.println((A+B).length());
     int compareTo = A.toLowerCase().compareTo(B.toLowerCase());
     if (compareTo>0) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
     System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()
    		 +" "
    		 +B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
     
    
}
}
