import java.util.Scanner;
public class NumberStatistics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0;i < arr.length;i++){
            System.out.print("Enter " + (i+1)+" number: ");
            int value = scan.nextInt();
            arr[i] = value;
        }
        System.out.print("Statistics"+ '\n');
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>0){
                count++;
            }

        }
        int count2 = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]<0){
                count2++;
            }}
            int count3 = 0;
            for(int a = 0;a < arr.length;a++){
                if(arr[a]==0){
                    count3++;
                }};
            int count4 = 0;
            for(int i = 0;i < arr.length;i++){
                if(arr[i]%2==0){
                    count4++;
                }}
        int count5 = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2==1 || arr[i]%2==-1){
                count5++;
            }}

        System.out.print("Positive numbers:" + count + '\n' + "Negative numbers:"+ count2 + '\n'+ "Zero numbers:"+ count3 + '\n'+ "Even numbers:"+ count4 + '\n'+ "Odd numbers:"+ count5);
    }
}