import java.util.Scanner;

public class Loop {
    public static void main(String args[]){        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a stop value for the loop: ");
        int stop = input.nextInt();
        for (int i=0; i<=stop; i++){
            System.out.println(i);
        }
    }
}
