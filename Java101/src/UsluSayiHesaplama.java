import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
         * "For Döngüsü" kullanarak yapınız.
         */
        int n,k,total=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n=scan.nextInt();
        System.out.print("Üs olacak sayı: ");
        k=scan.nextInt();
        for (int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Sonuç: "+total);
    }
}
