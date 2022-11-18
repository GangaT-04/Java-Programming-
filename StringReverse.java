import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        A=A.toLowerCase();
        int n=A.length();
        for(int i=n-1;i>=0;i--)
        {
            B=B+A.charAt(i);
        }
        if(A.equals(B))
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
