package hackerRank;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    static boolean isAnagram(String a, String b) {
    	Map<String, Long> charCount1 = a.toLowerCase().chars().mapToObj(c -> Character.toString((char) c))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    	Map<String, Long> charCount2 = b.toLowerCase().chars().mapToObj(c -> Character.toString((char) c))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	  
    	return charCount1.equals(charCount2);
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