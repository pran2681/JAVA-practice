import java.util.Scanner;

public class sum {
    //main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbee to sum: ");
        //input
        int a = sc.nextInt();
        int b =sc.nextInt();

        printSum(a, b);//method calling

        sc.close();

    }

    public static void printSum(int a,int b){
        int sum=a+b;
        System.out.println("Sum = "+sum);
        return;
    }
}
