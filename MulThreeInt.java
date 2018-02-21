import java.util.Scanner;

public class MulThreeInt {
    public static void main(String args[]) {
        System.out.println("This program calculates the product of three integers...");
        Scanner input = new Scanner(System.in);
        int x,y,z,result;
        System.out.println("Enter the first Integer: ");
        x = input.nextInt();
        System.out.println("Enter the second Integer: ");
        y = input.nextInt();
        System.out.println("Enter the third Integer: ");
        z = input.nextInt();
        result = x*y*z;
        System.out.println("The product of the three integers is: " + result);
    }
}