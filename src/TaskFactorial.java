import java.util.Scanner;

public class TaskFactorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
//        if(num.hasNextInt()) int f = num.nextInt();
//          int f = num.hasNextInt() ? num.nextInt() : 1;
        Factorial(num);
    }

    private static void Factorial(Scanner num) {
        int f = 1 ;
        int n = num.nextInt();
        for (int i = 1; i<=n; i++){

            f *= i;
            System.out.println(f);
        }
    }

}
