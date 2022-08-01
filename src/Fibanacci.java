import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        if(num.hasNextDouble()){
            fibanacci(num);
        }else System.out.println("eto ne chislo");
    }

    private static void fibanacci(Scanner num) {
        double f = num.nextDouble();
        double a=0, b=1, c=a+b, x=a+b, y=2;
        do{
            y++;
            x = x + c;
            a = b;
            b = c;
            c = a + b;
        }while( c <= f );
        double d = x/y;
        System.out.println(b);
    }
}
