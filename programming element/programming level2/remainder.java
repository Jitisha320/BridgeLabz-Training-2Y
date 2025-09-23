import java.util.*;
class remainder{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter a");
        double a=obj.nextDouble();
        System.out.print("enter b");
        double b=obj.nextDouble();
        double mod=a%b;
        double div=a/b;
        System.out.println("The Quotient is"+div+"and remainder is"+mod+"of two number"+a+"and"+b);

    }
    }