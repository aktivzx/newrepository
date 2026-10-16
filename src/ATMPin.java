import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;
public class ATMPin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        for(int att=2;att>-1;att--){
            int pass = sc.nextInt();
            int rightPass = 1234;
            if(pass != rightPass) {

                System.out.print("Incorrect Password!" + '\n' + "You have " + att + " attempts" + '\n' + "Enter your PIN: ");
                if(att ==0)
                    System.out.println( '\n' + "Card blocked");
            } else if (pass == rightPass) {

                System.out.print("Access granted!");
                break;
            }

        }
    }
}
