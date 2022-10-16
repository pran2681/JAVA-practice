import java.util.Scanner;

public class evenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        printEvenOdd(n);

    }

    public static void printEvenOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else if(num%2 != 0){
            System.out.println("Odd");
        }
    }
}
