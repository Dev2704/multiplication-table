import java.util.*;

public class loops {
    public static void main( String[] args){
        /*
        for(int i= 0; i < 5; i++){
            System.out.println(i);
        } */

        /*
        int i = 0;
        while(i<11){
            System.out.println(i);
            i++;
        } */
        /*
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<11); */
        System.out.print("Enter number of n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
