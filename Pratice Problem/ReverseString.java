import java.util.*;
public class ReverseString {
    public static String Reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.next();
        System.out.println("Reverse String:"+Reverse(s));
    }
}