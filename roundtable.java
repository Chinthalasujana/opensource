import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 3)
            System.out.println(6);
        else
            System.out.println(factorial(X - 1) * 2);
    }
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
