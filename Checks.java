import java.util.Scanner;

public class Checks {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int score;
        System.out.println("Enter your score to get a grade");
        score = input.nextInt();
        System.out.println("Your score is: " + score);
        if (score>=70 && score<=100) {
            System.out.println("Your grade is A");
        }
        else if (score>=60 && score<=69) {
            System.out.println("Your grade is B");
        }
        else if (score>=50 && score<=59) {
            System.out.println("Your grade is C");
        }
        else if (score>=45 && score<=49) {
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is F");
        }
    }
}