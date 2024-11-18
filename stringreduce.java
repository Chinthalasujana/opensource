import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 1;
        for( int i=1;i<input.length();i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                
                System.out.print(input.charAt(i - 1) + "" + count);
                count = 1;
            }
        }
        System.out.print(input.charAt(input.length() - 1) + "" + count);
    }
}
