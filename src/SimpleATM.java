import java.util.Scanner;
public class SimpleATM {
    public static void main(String[] args){
        System.out.print("=====SYSTEM ATM=====");
        Scanner sc = new Scanner(System.in);
        System.out.println('\n'+"Enter your PIN: ");
        for(int att=2;att>=0;att--){
            int pass = sc.nextInt();
            int rightPass = 1234;
            if(pass != rightPass) {

                System.out.print("Incorrect Password!" + '\n' + "You have " + att + " attempts" + '\n' + "Enter your PIN: ");
                if(att ==0) {
                    System.out.println('\n' + "Card blocked");
                    System.exit(0);
                }

            } else if (pass == rightPass) {

                System.out.print("Access granted!");
                break;
            }

        }
        int bal = 2400;
        for(int i = 0;;){
            System.out.print('\n'+"=====ATM MENU=====" + '\n' + "1.Check balance" + '\n'+ "2.Deposite money"+ '\n'+"3.Withdraw money"+ '\n'+"4.Exit" + '\n'+ "Choose your options: ");
            int op = sc.nextInt();
            if (op == 1)
                System.out.print("Current balance:" + bal + '\n');
            else if(op ==2){
                for(;;){
                    System.out.print("Enter your deposit amount:");
                    int dep = sc.nextInt();
                    if (dep<0){
                        System.out.println("Error! Try again");
                    }
                    else if(dep>=0){
                        System.out.println("Deposit successful\nYour new balance is " + (bal += dep));
                        break;
                    }
                }}
            else if(op ==3){
                for(;;) {
                    System.out.println("Enter your withdrawal amount:");
                    int with = sc.nextInt();
                    if(with<=0){
                        System.out.println("Error!\nTry again");
                        break;
                    }
                    else if(with>bal)
                        System.out.println("Error!\nWithdrawal can not be greater than current balance");
                    else if(with>0){
                        System.out.println("Withdrawal successful\nYour new balance:" + (bal-=with));
                        break;
                    }

                }
            }
            else if(op==4){
                sc.close();
                System.exit(0);}

        }
    }
}
