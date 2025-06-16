import java.util.*;
public class ifStat {
    public static void main(String[] args){
        System.out.println("    EVEN OR ODD    ");
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
