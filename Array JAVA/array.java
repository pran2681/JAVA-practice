import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int numbers[]= new int[size];

        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element which you want to search: ");
        int x=sc.nextInt();


        System.out.println("OUTPUT");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("X is found in index "+i);
            }
        }
        sc.close();
    }
}