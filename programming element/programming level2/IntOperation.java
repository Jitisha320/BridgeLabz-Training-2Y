import java.util.*;
class IntOperation{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter a");
        int a=obj.nextInt();
        System.out.print("enter b");
        int b=obj.nextInt();
        System.out.print("enter c");
        int c=obj.nextInt();
        int i=a+b*c;
        int n=a*b+c;
        int t=c+a/b;
        int d=a%b+c;
        System.out.println("The result of int operation are "+i+" " +n+" " +t+" " +"and "+d );

    }
}