import java.util.Scanner;

public class PalindromeStr{
    public static boolean Palindrome(String s){
        String temp=s;
        String rev="";
        boolean p=false;
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(temp)){
            p=true;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();  
        System.out.println(Palindrome(s));
    }
}