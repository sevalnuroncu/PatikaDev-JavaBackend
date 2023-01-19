import java.util.Scanner;

public class UcgeninAlanı {
    public static void main(String[] args) {
        /**
         * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         */
        double a,b,c,u,cevre,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("1. kenar: ");
        a=input.nextInt();
        System.out.print("2. kenar: ");
        b=input.nextInt();
        System.out.print("2. kenar: ");
        c=input.nextInt();
        cevre=a+b+c;
        u=cevre/2.0;
        alan=Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Alan: "+alan);

    }
}
