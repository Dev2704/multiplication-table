import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args){

        System.out.print("Enter the num of table you want: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("\nMultiplication Table of " + num + ":\n");


        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        sc.close();
    }
}
