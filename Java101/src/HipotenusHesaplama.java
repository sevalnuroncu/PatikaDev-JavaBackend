import java.util.Scanner;



public class HipotenusHesaplama {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
         */
        int a,b;
        double hipotenus;
        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a=input.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b=input.nextInt();

        hipotenus=Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs: "+hipotenus);
    }
}
