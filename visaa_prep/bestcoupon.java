import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x*10/100>100)
            System.out.println(x-(x * 10 / 100));
        else
            System.out.println(x-100);
    }
}
