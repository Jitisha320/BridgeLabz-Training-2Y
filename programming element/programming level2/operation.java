import java.util.*;
class operation{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter a");
        double a=obj.nextDouble();
        System.out.print("enter b");
        double b=obj.nextDouble();
        System.out.print("enter c");
        double c=obj.nextDouble();
        double i=a+b*c;
        double n=a*b+c;
        double t=c+a/b;
        double d=a%b+c;
        System.out.println("The result of int operation are "+i+n+t+"and"+d);

    }
    }