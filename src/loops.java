import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int i = 1;
        while (i <= 1000) {
            int beforeValue = i;
            i *= 10;
            int afterValue = i;
            System.out.println(beforeValue + " * 10 = " + afterValue);
        }
        for (int a = 1; a <= 1000; a *= 10) {
            int beforeValue = a;
            int afterValue = a * 10;
            System.out.println( beforeValue + " * 10 = " + afterValue);
        }*/
        int n = scanner.nextInt();
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j++;}
           /* boolean l = true;
            while(l=true){
                System.out.println("Hi");
            }*/
        System.out.println("Enter even number:");
        int s = scanner.nextInt();
        for(int h =2;h<=s;h+=2){
            System.out.println(h);
        }
        System.out.println("Enter odd number:");
        int m = scanner.nextInt();
        for(int h =1;h<=m;h+=2){
            System.out.println(h);
        }
        for (int d = 1; d <= 20; d++) {
            if (d % 3 == 0 && d % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (d % 3 == 0) {
                System.out.println("Fizz");
            } else if (d % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(d);


            }}}}