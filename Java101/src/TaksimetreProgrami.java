import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        /**
         * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
         * Taksimetre açılış ücreti 10 TL'dir.
         */
        int acilisUcreti=10;
        double tutar, mesafe,perKM=2.20;


        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe=input.nextDouble();
        tutar=acilisUcreti+(mesafe*perKM);
        //System.out.println(tutar<20 ? "Taksimetre Tutarı= "+ 20 : "Taksimetre Tutarı= "+tutar );
        tutar=(tutar<20) ? 20 : tutar;
        System.out.println("Taksimetre Tutarı= "+tutar);

    }
}
