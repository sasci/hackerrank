package hackerRank;
import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ser[] = serByRec(a, b, n);
        
            for (int s : ser) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }

    public static int[] serByRec(int a, int b, int n) {
        int ser[] = new int[n];
        for (int i = 0; i < n; i++) {
            ser[i] = series(a, b, i + 1);
        }
        return ser;
    }

    public static int series(int a, int b, int n) {
        if (n == 1) {
            return a + b;
        } else {
            return ((int) (Math.pow(2, (n - 1)) * b) + series(a, b, n - 1));
        }
    }
}