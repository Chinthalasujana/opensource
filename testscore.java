import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while (Y >= 0 && N > 0) {
            if (Y == 0) {
                System.out.println("YES");
            }
            Y -= X;
            N--;
        }
        System.out.println("NO");
        
    }
}
