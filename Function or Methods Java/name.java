import java.util.Scanner;

public class name{
    ////main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();///input

        printName(name);///method calling

        sc.close();
    }

    ///method
    public static void printName(String name){
        System.out.println("Your name is: "+name);
        return;
    }
}
