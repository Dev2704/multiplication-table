import java.util.Scanner;
public class buttons {
    public static void main(String[] args) {
        System.out.print("Enter 1 for Eng or 2 for Hindi: ");
        Scanner sc = new Scanner(System.in);
        int btn = sc.nextInt();

        switch (btn){
            case 1: System.out.println("Hello!!!");
                break;
            case 2: System.out.println("Namaste!!!");
                break;
            default: System.out.println("wrong choice!!!");
                break;
        }
    }
}
