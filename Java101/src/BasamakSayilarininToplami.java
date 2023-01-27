import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        /**
         * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
         * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */
        int number, basValue, result=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        number=scan.nextInt();
        while(number!=0){
            basValue=number%10;
            result+=basValue;
            number/=10;

        }
        System.out.println("Result: "+result);
    }
}
