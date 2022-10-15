import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh number: ");
        int n = sc.nextInt();

        printFactorial(n);

    }

    public static void printFactorial(int n){

        int fact =1;
        for(int i=n;i>1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial ="+fact);
        return;
    }
}
