import java.util.Scanner;
public class GuessNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        for (int att = 4;att>0;att--){
            int rightNum = 4;
            int num = scan.nextInt();
            if (att == 1){
                System.out.print("Game over!" + '\n' + "Secret number is " + rightNum);
            }
            else if (num > rightNum)
                System.out.print("too high!" + '\n');
            else if (num < rightNum)
                System.out.print("too low!" + '\n');
            else System.out.print("You won!");
        }
    }
}