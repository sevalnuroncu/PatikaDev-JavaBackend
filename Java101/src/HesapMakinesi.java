import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2, secim;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim=input.nextInt();

        switch (secim){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if(n2!=0){
                    System.out.println(n1/n2);
                }else{
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;

            default:
                System.out.println("hatalı giriş yaptınız");
        }






    }
}
