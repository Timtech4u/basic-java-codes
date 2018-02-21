import java.util.Scanner;

public class Calc {
    public static void main(String args[]){        
        Scanner collectAm = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a = collectAm.nextInt();
        b = collectAm.nextInt();
        System.out.println(a+" + "+b+"="+ (a+b));
        System.out.println(a+" - "+b+"="+ (a-b));
        System.out.println(a+" / "+b+"="+ (a/b));
        System.out.println(a+" * "+b+"="+ (a*b));
    }
}