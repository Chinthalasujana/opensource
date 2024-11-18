import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        char charan = sc.next().charAt(0);
        char vignesh = sc.next().charAt(0);
         
        if ((charan == 'S' && vignesh == 'R') ||
            (charan == 'R' && vignesh == 'P') ||
             (charan == 'P' && vignesh == 'S')) 
        {
            System.out.println("Charan");
        } else {
            System.out.println("Vignesh");
        }
        
    }
}
